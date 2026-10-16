package com.example.rescene.group;

import com.example.rescene.member.Member;
import com.example.rescene.member.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController   // 리턴한 String이 그대로 브라우저 화면에 나감
public class GroupController {

    private final GroupService groupService;
    private final MemberService memberService;

    public GroupController(GroupService groupService, MemberService memberService) {
        this.groupService = groupService;
        this.memberService = memberService;
    }

    @GetMapping("/groups")   // localhost:8080/groups 로 들어오면 이 메서드 실행
    public String list() {
        try {
            List<Group> groups = groupService.findAll();
            return toGroupListString(groups);
        } catch (IllegalArgumentException e) {
            return "ERROR: " + e.getMessage();
        }
    }

    @GetMapping("/groups/sample")
    public String detail() {
        Long id = 1L;   // 조회할 그룹 ID
        try {
            Group group = groupService.findById(id);
            return toGroupString(group);
        } catch (IllegalArgumentException e) {
            return "ERROR: " + e.getMessage();
        }
    }

    @GetMapping("/groups/join")
    public String create() {
        String name = "RESCENE";   // S2에서 KISSOFLIFE로 변경
        Integer debutYear = 2024;  // S2에서 2023으로 변경
        try {
            Group group = groupService.create(name, debutYear);
            return toGroupString(group);
        } catch (IllegalArgumentException e) {
            return "ERROR: " + e.getMessage();
        }
    }

    @GetMapping("/groups/delete")
    public String delete() {
        Long id = 1L;   // 삭제할 그룹 ID
        try {
            groupService.delete(id);
            return "DELETED: id=" + id;
        } catch (IllegalArgumentException e) {
            return "ERROR: " + e.getMessage();
        }
    }

    @GetMapping("/groups/members")
    public String members() {
        Long id = 1L;   // 멤버 목록을 볼 그룹 ID
        try {
            groupService.findById(id);   // 그룹이 없으면 여기서 예외
            List<Member> members = memberService.findByGroup(id);
            return toMemberListString(members);
        } catch (IllegalArgumentException e) {
            return "ERROR: " + e.getMessage();
        }
    }

    // ===== 문자열 만드는 도우미 메서드들 =====

    private String toMemberString(Member member) {
        StringBuilder sb = new StringBuilder();
        sb.append("Member{");
        sb.append("id=").append(member.getId());
        sb.append(", stageName=").append(member.getStageName());
        sb.append(", realName=").append(member.getRealName());
        sb.append(", position=").append(member.getPosition());
        sb.append("}");
        return sb.toString();
    }

    private String toMemberListString(List<Member> members) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < members.size(); i++) {
            if (i > 0) {
                sb.append("\n");
            }
            sb.append(toMemberString(members.get(i)));
        }
        return sb.toString();
    }

    private String toGroupString(Group group) {
        StringBuilder sb = new StringBuilder();
        sb.append("Group{");
        sb.append("id=").append(group.getId());
        sb.append(", name=").append(group.getName());
        sb.append(", debutYear=").append(group.getDebutYear());
        sb.append("}");
        for (Member m : group.getMembers()) {
            sb.append("\n");
            sb.append("  - ").append(toMemberString(m));
        }
        return sb.toString();
    }

    private String toGroupListString(List<Group> groups) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < groups.size(); i++) {
            if (i > 0) {
                sb.append("\n\n");
            }
            sb.append(toGroupString(groups.get(i)));
        }
        return sb.toString();
    }
}