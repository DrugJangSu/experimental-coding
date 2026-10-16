package com.example.rescene.group;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// JpaRepository<다룰 엔티티, 그 엔티티의 id 타입>
// → save, findAll, findById, deleteById 같은 기본 기능을 자동으로 물려받음
public interface GroupRepository extends JpaRepository<Group, Long> {

    // 메서드 이름만 규칙대로 지으면 Spring이 "name으로 찾는 SQL"을 자동으로 만들어줌
    Optional<Group> findByName(String name);
}