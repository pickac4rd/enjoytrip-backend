package com.user.controller;

import com.user.service.MemberService;
import com.user.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/member")
public class MemberController {

    @Autowired
    MemberService service;

    @PostMapping("/signup")
    public Member signUpProcess(Member member){
        return service.insert(member);
    }

}
