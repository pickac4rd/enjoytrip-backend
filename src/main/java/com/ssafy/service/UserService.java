package com.ssafy.service;

import com.ssafy.vo.User;

import java.util.Map;

public interface UserService {
	User login(User user) throws Exception;

	User userInfo(String userid) throws Exception;

	void saveRefreshToken(String userid, String refreshToken) throws Exception;

	Object getRefreshToken(String userid) throws Exception;

	void deleteRefreshToken(String userid) throws Exception;

	int idcheck(String id) throws Exception;

	void addUser(Map<String, String> map) throws Exception;

	void updateUser(User user) throws Exception;

	void removeUser(int uid) throws Exception;
	
	String getIdByEmail(String email) throws Exception;
	
	User getUidForPw(String id) throws Exception;
	
	void changeTempPw(Map<String, String> map) throws Exception;
}
