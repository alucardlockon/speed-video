package com.ywh.biz;

import com.ywh.entity.User;

public interface UserBiz {

	void regist(User user);

	User findUserByName(String username);

	void updateLastLogin(User validUser);

	User findUserById(int id);

}
