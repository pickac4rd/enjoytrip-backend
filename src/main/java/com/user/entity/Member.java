package com.user.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
    @Id
    private String userId;
    private String userPw;
    private String userEmail;
    private String userPhone;
    private String userName;
    private String userRole;
}
