package com.user.service;

import com.user.repository.MemberRepository;
import com.user.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberRepository repository;
    @Override
    public Member insert(Member member) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        member.setUserPw(encoder.encode(member.getUserPw()));
        member.setUserRole("USER");
        return repository.save(member);
    }

    @Override
    public List<Member> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Member> findById(String userId) {
        return repository.findById(userId);
    }



}
