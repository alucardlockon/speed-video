package com.ywh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ywh.dao.UserDao;
import com.ywh.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	/**
	 * 保存用户信息
	 */
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	/**
	 * 根据用户名查找用户，用在登录注册上
	 */
	public User findUserByName(String username) {
		String hql = "from User where username=?";
		List<User> userlist = this.getHibernateTemplate().find(hql,
				new Object[] { username });
		if (userlist.size() < 1) {
			return null;
		}
		return userlist.get(0);
	}

	/**
	 * 通过用户id查找用户
	 */
	public User findUserById(int id) {
		return (User) this.getHibernateTemplate().get(User.class, id);
	}

	/**
	 * 更新用户
	 */
	public void updateUser(User user) {
		this.getHibernateTemplate().update(user);
	}

}
