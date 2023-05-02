package com.member.controller;

import com.member.service.MemberService;
import com.member.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.HashMap;
import java.util.Map;

@RestController()
public class MemberController {

    @Autowired
    MemberService service;

    @PostMapping("/member/signupProcess")
    public ResponseEntity signUpProcess(@RequestBody Member member){
        int x = 0;
        ResponseEntity responseEntity;
        member.setUserRole("USER");
        try {
            x = service.insert(member);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(x==1)
            return new ResponseEntity<>(HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/member/loginProcess")
    public ResponseEntity<Member> loginProcess(@RequestBody Member member, HttpSession session){
        Member newMember = service.login(member);
        if(newMember==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null); //user not found
        }else{
            session.setAttribute("member",newMember);
            return ResponseEntity.status(HttpStatus.OK).body(newMember);
        }
    }

    @DeleteMapping("/member/{userId}")
    public int deleteMember(@PathVariable String userId){
        return service.delete(userId);
    }

    @PutMapping("/member/{userId}")
    public int updateMember(@RequestBody Member member){
        return service.update(member);
    }

}
