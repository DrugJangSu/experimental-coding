package com.example.rescene.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByStageName(String stageName);   // 활동명으로 찾기

    boolean existsByStageName(String stageName);          // 활동명이 이미 있는지 확인

    List<Member> findByGroupId(Long groupId);             // 특정 그룹 소속 멤버 전부 찾기
}