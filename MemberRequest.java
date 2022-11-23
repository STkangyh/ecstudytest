package io.seoultech.ecstudy;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class MemberRequest {

    private String userID;
    private String password;

    public String getUserID() {
        return userID;
    }

    public MemberRequest(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
