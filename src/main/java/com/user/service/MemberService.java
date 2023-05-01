package com.user.service;

import com.user.entity.Member;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    Member insert(Member member);

    List<Member> findAll();

    Optional<Member> findById(String userId);

}
