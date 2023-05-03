package com.interceptor;

import com.member.vo.Member;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminInterceptor {

    @Component
    @Order(2)
    public class SessionInterceptor implements HandlerInterceptor {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            HttpSession session = request.getSession();
            Member m = (Member) session.getAttribute("member");
            if(m.getUserRole().equals("ADMIN")){
                return true;
            }
            else{
//            response.sendRedirect("loginForm");
                return false;
            }
        }
    }

}
