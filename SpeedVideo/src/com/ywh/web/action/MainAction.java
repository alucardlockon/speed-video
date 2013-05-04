package com.ywh.web.action;

/**
 * 主Action，负责主页面跳转
 * @author YWH
 */
public class MainAction {
	/**
	 * 主页跳转
	 */
	public String execute() {
		return "index";
	}

	/**
	 * 移动页跳转
	 */
	public String tomobile() {

		return "mobileindex";
	}
}
