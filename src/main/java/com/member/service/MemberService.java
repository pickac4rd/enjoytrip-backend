package com.member.service;

import com.member.vo.Member;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    int insert(Member member);

    List<Member> findAll();

    Member login(Member member);

    int delete(String userId);

    int update(Member member);
}
