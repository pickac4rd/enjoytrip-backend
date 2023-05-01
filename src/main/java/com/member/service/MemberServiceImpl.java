package com.member.service;

import com.member.vo.Member;
import com.member.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberMapper mapper;
    @Override
    public int insert(Member member) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        member.setUserPw(encoder.encode(member.getUserPw()));
        member.setUserRole("USER");
        return mapper.insert(member);
    }

    @Override
    public List<Member> findAll() {
        return null;
    }

    @Override
    public Optional<Member> findById(String userId) {
        return Optional.empty();
    }

//
//    @Override
//    public List<Member> findAll() {
//        return mapper.insert();
//    }



}
