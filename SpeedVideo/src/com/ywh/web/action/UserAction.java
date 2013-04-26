package com.ywh.web.action;

import java.util.Date;

import com.ywh.biz.UserBiz;
import com.ywh.entity.User;
import com.ywh.util.CookieUtil;

public class UserAction extends BaseAction {
	UserBiz userBiz;
	User user;

	public String quickRegist() {
		user.setName("didNotSetName");
		user.setEmail("didNotSetEmail");
		user.setRegist_date(new Date(System.currentTimeMillis()));
		user.setRights(1);
		userBiz.regist(user);
		return "regist";
	}

	public String quickLogin() {
		User validUser = userBiz.findUserByName(user.getUsername());
		if (validUser != null) {
			if (validUser.getPassword().equals(user.getPassword())) {
				userBiz.updateLastLogin(validUser);
				session.put("user", validUser);
				CookieUtil.addCookie("username",validUser.getUsername(),response);
				CookieUtil.addCookie("password",validUser.getPassword(),response);
				return "login";
			}
		}
		return "error";
	}

	public String exitlogin() {
		session.remove("user");
		return "login";
	}
	

	// TODO:ÍêÕû×¢²áµÇÂ¼
	public String regist() {

		return "regist";
	}

	public String login() {

		return "login";
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
