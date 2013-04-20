package com.ywh.dao;

import com.ywh.entity.User;

public interface UserDao {

	void save(User user);

	User findUserByName(String username);

	void updateLastLogin(User validUser);

}
