//package com.security;
//
//import com.member.vo.Member;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SecurityMember extends User {
//    public SecurityMember(Member member){
//        super(member.getUserId(),member.getUserPw(),makeGrantedAuthority());
//    }
//
//    private static List<GrantedAuthority> makeGrantedAuthority(){
//        List<GrantedAuthority> list = new ArrayList<>();
//        list.add(new SimpleGrantedAuthority("ROLE_USER"));
//        list.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//        return list;
//    }
//}
