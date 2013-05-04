package com.ywh.web.action;

import java.util.Date;
import java.util.List;

import com.ywh.biz.UserBiz;
import com.ywh.biz.VideoBiz;
import com.ywh.entity.User;
import com.ywh.entity.Video;
import com.ywh.util.CookieUtil;

/**
 * 用户Action，负责注册登录，显示用户信息
 * 
 * @author YWH
 */
public class UserAction extends BaseAction {
	UserBiz userBiz;
	VideoBiz videoBiz;
	List<Video> videolist;
	User user;
	String intro;

	/**
	 * 快速注册，其中name,email等自动设定
	 */
	public String quickRegist() {
		user.setName("didNotSetName");
		user.setEmail("didNotSetEmail");
		user.setRegist_date(new Date(System.currentTimeMillis()));
		user.setRights(1);
		user.setPhoto("title.png");
		user.setGender("保密");
		userBiz.regist(user);
		return "regist";
	}

	/**
	 * 快速登录
	 */
	public String quickLogin() {
		User validUser = userBiz.findUserByName(user.getUsername());
		if (validUser != null) {
			if (validUser.getPassword().equals(user.getPassword())) {
				userBiz.updateLastLogin(validUser);
				session.put("user", validUser);
				CookieUtil.addCookie("username", validUser.getUsername(),
						response);
				CookieUtil.addCookie("password", validUser.getPassword(),
						response);
				return "login";
			}
		}
		return "error";
	}

	/**
	 * 退出登录
	 */
	public String exitlogin() {
		session.remove("user");
		return "login";
	}

	/**
	 * 展示用户信息
	 */
	public String userinfo() {
		user = userBiz.findUserById(user.getId());
		List<Integer> ids = videoBiz.findIdByVideolist(user);
		videolist = videoBiz.showBylist(ids);
		return "userinfo";
	}

	/**
	 * 修改用户信息
	 */
	public String editintro() {
		user = userBiz.findUserById(user.getId());
		user.setIntro(intro);
		userBiz.update(user);
		return "userinfo";
	}

	/**
	 * 完整注册
	 */
	public String regist() {
		user.setRegist_date(new Date(System.currentTimeMillis()));
		user.setRights(1);
		user.setPhoto("title.png");
		userBiz.regist(user);
		return "regist";
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

	public List<Video> getVideolist() {
		return videolist;
	}

	public void setVideolist(List<Video> videolist) {
		this.videolist = videolist;
	}

	public void setVideoBiz(VideoBiz videoBiz) {
		this.videoBiz = videoBiz;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

}
