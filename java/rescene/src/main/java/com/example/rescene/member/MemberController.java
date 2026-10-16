package com.example.rescene.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members")
    public String list() {
        try {
            List<Member> members = memberService.findAll();
            return toMemberListString(members);
        } catch (IllegalArgumentException e) {
            return "ERROR: " + e.getMessage();
        }
    }

    @GetMapping("/members/sample")
    public String detail() {
        Long id = 1L;   // 조회할 멤버 ID
        try {
            Member member = memberService.findById(id);
            return toMemberString(member);
        } catch (IllegalArgumentException e) {
            return "ERROR: " + e.getMessage();
        }
    }

    @GetMapping("/members/join")
    public String join() {
        String stageName = "Natty";
        String realName = "나띠";
        String position = "댄서";
        Long groupId = 999L;
        try {
            Member member = memberService.join(stageName, realName, position, groupId);
            return toMemberString(member);
        } catch (IllegalArgumentException e) {
            return "ERROR: " + e.getMessage();
        }
    }

    @GetMapping("/members/update")
    public String update() {
        Long id = 1L;        // 수정할 멤버 ID
        String stageName = "Woni";
        String realName = "김원이";
        String position = "리더";
        Long groupId = 2L;   // 옮겨갈 그룹 ID
        try {
            Member member = memberService.update(id, stageName, realName, position, groupId);
            return toMemberString(member);
        } catch (IllegalArgumentException e) {
            return "ERROR: " + e.getMessage();
        }
    }

    @GetMapping("/members/delete")
    public String delete() {
        Long id = 2L;   // 삭제할 멤버 ID
        try {
            memberService.delete(id);
            return "DELETED: id=" + id;
        } catch (IllegalArgumentException e) {
            return "ERROR: " + e.getMessage();
        }
    }

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
}