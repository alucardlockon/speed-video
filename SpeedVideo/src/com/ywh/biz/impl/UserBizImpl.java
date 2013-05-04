package com.ywh.biz.impl;

import java.sql.Date;

import com.ywh.biz.UserBiz;
import com.ywh.dao.UserDao;
import com.ywh.entity.User;

public class UserBizImpl implements UserBiz {
	UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void regist(User user) {
		userDao.save(user);
	}

	public User findUserByName(String username) {
		return userDao.findUserByName(username);
	}

	public void updateLastLogin(User validUser) {
		validUser.setLast_login(new Date(System.currentTimeMillis()));
		userDao.updateUser(validUser);
	}

	public User findUserById(int id) {
		return userDao.findUserById(id);
	}

	public void updatePhoto(User user) {
		userDao.updateUser(user);
	}

	public void update(User user) {
		userDao.updateUser(user);
	}

}
