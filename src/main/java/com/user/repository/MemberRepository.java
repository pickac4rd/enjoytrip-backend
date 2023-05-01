package com.user.repository;

import com.user.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.http.ResponseEntity;

public interface MemberRepository extends JpaRepository<Member,String> {

}
