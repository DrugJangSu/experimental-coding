package com.example.rescene.group;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service   // Spring이 이 클래스를 "서비스 직원"으로 등록해서 관리
public class GroupService {

    private final GroupRepository groupRepository;

    // 생성자 주입: Spring이 GroupRepository를 알아서 넣어줌
    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public Group create(String name, Integer debutYear) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("그룹명은 비어 있을 수 없습니다");
        }
        if (groupRepository.findByName(name).isPresent()) {
            throw new IllegalArgumentException("이미 존재하는 그룹명입니다: " + name);
        }
        Group group = new Group(name, debutYear);
        return groupRepository.save(group);
    }

    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    public Group findById(Long id) {
        Optional<Group> optional = groupRepository.findById(id);
        if (optional.isEmpty()) {
            throw new IllegalArgumentException("해당 id의 그룹이 없습니다: " + id);
        }
        return optional.get();
    }

    public void delete(Long id) {
        findById(id);                     // 없으면 위에서 예외
        groupRepository.deleteById(id);   // cascade 덕분에 소속 멤버도 같이 삭제
    }
}