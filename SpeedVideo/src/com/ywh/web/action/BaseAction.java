package com.ywh.web.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class BaseAction implements SessionAware {
	Map<String, Object> session;

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
