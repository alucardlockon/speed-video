package com.ywh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ywh.dao.UserDao;
import com.ywh.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	public User findUserByName(String username) {
		String hql = "from User where username=?";
		List<User> userlist = this.getHibernateTemplate().find(hql,
				new Object[] { username });
		if (userlist.size() < 1) {
			return null;
		}
		return userlist.get(0);
	}

	public void updateLastLogin(User validUser) {
		this.getHibernateTemplate().update(validUser);
	}

	public User findUserById(int id) {
		return (User) this.getHibernateTemplate().get(User.class, id);
	}

}
