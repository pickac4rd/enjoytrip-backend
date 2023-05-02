
package com.member.service;

import com.member.vo.Member;
import com.member.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberMapper mapper;

    @Override
    public int insert(Member member) {
        return mapper.insert(member);
    }

    @Override
    public List<Member> findAll() {
        return null;
    }

    @Override
    public Member login(Member member) {
        return mapper.login(member);
    }

    @Override
    public int delete(String userId) {
        return mapper.delete(userId);
    }

    @Override
    public int update(Member member) {
        return mapper.update(member);
    }
}



