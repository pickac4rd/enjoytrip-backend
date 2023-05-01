package com.member.mapper;

import com.member.vo.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    int insert(Member member);

}
