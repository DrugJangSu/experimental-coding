package com.example.rescene.group;

import com.example.rescene.member.Member;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity                          // 이 클래스는 DB 테이블 설계도다
@Table(name = "music_group")     // 테이블 이름 지정 (group은 SQL 예약어라 못 씀)
public class Group {

    @Id                                                   // 기본 키(PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // id는 DB가 1, 2, 3... 자동 부여
    private Long id;

    @Column(nullable = false, unique = true, length = 50) // NOT NULL, 중복 불가, 최대 50자
    private String name;

    @Column(nullable = false)
    private Integer debutYear;

    // 그룹 1개 : 멤버 여러 명
    @OneToMany(mappedBy = "group",           // 관계의 주인은 Member 쪽의 group 필드
            cascade = CascadeType.ALL,    // 그룹 저장/삭제 시 멤버도 같이
            orphanRemoval = true,         // 목록에서 빠진 멤버는 DB에서도 삭제
            fetch = FetchType.EAGER)      // 그룹 조회할 때 멤버도 바로 같이 가져오기
    private List<Member> members = new ArrayList<>();

    protected Group() {                      // JPA가 내부적으로 쓰는 기본 생성자 (필수)
    }

    public Group(String name, Integer debutYear) {   // 우리가 그룹 만들 때 쓰는 생성자
        this.name = name;
        this.debutYear = debutYear;
    }

    // 그룹에 멤버 추가 + 멤버 쪽에도 소속 그룹 기록 (양쪽 다 연결)
    public void addMember(Member member) {
        this.members.add(member);
        member.setGroup(this);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getDebutYear() {
        return debutYear;
    }

    public List<Member> getMembers() {
        return members;
    }
}