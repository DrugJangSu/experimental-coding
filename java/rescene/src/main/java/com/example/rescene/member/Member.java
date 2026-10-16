package com.example.rescene.member;

import com.example.rescene.group.Group;
import jakarta.persistence.*;

@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 30)
    private String stageName;

    @Column(nullable = false, length = 30)
    private String realName;

    @Column(nullable = false, length = 30)
    private String position;

    // 멤버 여러 명 : 그룹 1개
    // 이쪽이 관계의 "주인" → DB의 member 테이블에 group_id 칼럼이 생김
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    protected Member() {
    }

    public Member(String stageName, String realName, String position) {
        this.stageName = stageName;
        this.realName = realName;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public String getStageName() {
        return stageName;
    }

    public String getRealName() {
        return realName;
    }

    public String getPosition() {
        return position;
    }

    public Group getGroup() {
        return group;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}