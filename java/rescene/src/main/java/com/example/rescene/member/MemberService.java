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

        // 그룹이 바뀔 때만: 예전 그룹 명단에서 빼고, 새 그룹에 넣기
        Group oldGroup = member.getGroup();
        if (!oldGroup.getId().equals(groupId)) {
            oldGroup.getMembers().remove(member);
            newGroup.addMember(member);
        }

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