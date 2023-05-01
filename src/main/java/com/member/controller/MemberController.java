package com.member.controller;

import com.member.service.MemberService;
import com.member.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
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
