package com.example.rescene.member;

import com.example.rescene.group.Group;
import com.example.rescene.group.GroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final GroupRepository groupRepository;

    public MemberService(MemberRepository memberRepository,
                         GroupRepository groupRepository) {
        this.memberRepository = memberRepository;
        this.groupRepository = groupRepository;
    }

    public Member join(String stageName, String realName, String position, Long groupId) {
        if (stageName == null || stageName.trim().isEmpty()) {
            throw new IllegalArgumentException("활동명은 비어 있을 수 없습니다");
        }
        if (memberRepository.existsByStageName(stageName)) {
            throw new IllegalArgumentException("이미 존재하는 활동명입니다: " + stageName);
        }

        Optional<Group> groupOptional = groupRepository.findById(groupId);
        if (groupOptional.isEmpty()) {
            throw new IllegalArgumentException("해당 id의 그룹이 없습니다: " + groupId);
        }
        Group group = groupOptional.get();

        Member member = new Member(stageName, realName, position);
        group.addMember(member);              // 양쪽 연결
        return memberRepository.save(member);
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public Member findById(Long id) {
        Optional<Member> optional = memberRepository.findById(id);
        if (optional.isEmpty()) {
            throw new IllegalArgumentException("해당 id의 멤버가 없습니다: " + id);
        }
        return optional.get();
    }

    public Member update(Long id, String stageName, String realName,
                         String position, Long groupId) {
        Member member = findById(id);

        // 바꾸려는 활동명을 "다른 멤버"가 쓰고 있으면 예외
        Optional<Member> found = memberRepository.findByStageName(stageName);
        if (found.isPresent()) {
            Member other = found.get();
            if (!other.getId().equals(id)) {
                throw new IllegalArgumentException("이미 존재하는 활동명입니다: " + stageName);
            }
        }

        Optional<Group> groupOptional = groupRepository.findById(groupId);
        if (groupOptional.isEmpty()) {
            throw new IllegalArgumentException("해당 id의 그룹이 없습니다: " + groupId);
        }
        Group newGroup = groupOptional.get();

        // ===== 여기부터 바뀐 부분 =====
        // 껍데기(LAZY)에서 id만 꺼내기 → id는 껍데기도 알고 있어서 에러 안 남
        Long oldGroupId = member.getGroup().getId();

        if (!oldGroupId.equals(groupId)) {
            // 예전 그룹을 DB에서 새로 불러옴 → 멤버 목록까지 진짜 데이터로 옴
            Group oldGroup = groupRepository.findById(oldGroupId).get();

            // 예전 그룹 명단에서 같은 id의 멤버를 찾아서 빼기
            List<Member> oldMembers = oldGroup.getMembers();
            for (int i = 0; i < oldMembers.size(); i++) {
                if (oldMembers.get(i).getId().equals(id)) {
                    oldMembers.remove(i);
                    break;
                }
            }

            newGroup.addMember(member);
        }
        // ===== 여기까지 =====

        member.setStageName(stageName);
        member.setRealName(realName);
        member.setPosition(position);

        return memberRepository.save(member);   // @Transactional이 없어서 save 필수
    }

    public void delete(Long id) {
        findById(id);
        memberRepository.deleteById(id);
    }

    public List<Member> findByGroup(Long groupId) {
        return memberRepository.findByGroupId(groupId);
    }

}