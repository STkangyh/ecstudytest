package io.seoultech.ecstudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //전략이 IDENTITY?->mysql이 알아서 ID에 숫자를 생성하기 때문에 이정도만 해도 괜찮음
    private Long id;

    private String userID;

    private String password;

    public Member(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public Member() {
    }
}
