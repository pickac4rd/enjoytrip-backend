package com.member.vo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
    private String userId;
    private String userPw;
    private String userEmail;
    private String userPhone;
    private String userName;
    private String userRole;
}
