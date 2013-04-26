package com.ywh.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
	// 设置应用名
	private static String path = "/YYOnline";
	// 设置缺省生存时间
	private static int age = 3600 * 24;

	// 添加cookie,需要考虑编码问题、
	// 生存时间问题、路径问题。
	public static void addCookie(String name, String value, int age,
			HttpServletResponse response) {
		Cookie c = new Cookie(name, value);
		c.setMaxAge(age);
		c.setPath(path);
		response.addCookie(c);
	}

	public static void addCookie(String name, String value,
			HttpServletResponse response) {
		Cookie c = new Cookie(name, value);
		c.setMaxAge(age);
		c.setPath(path);
		response.addCookie(c);
	}

	public static void delCookie(String name, HttpServletResponse response) {
		Cookie c = new Cookie(name, "");
		c.setPath(path);
		c.setMaxAge(0);
		response.addCookie(c);
	}

	public static String findCookie(String name, HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (name.equals(cookie.getName())) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}
}
