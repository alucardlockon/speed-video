package com.ywh.web.action;

import java.util.Date;

import com.ywh.biz.CommentBiz;
import com.ywh.biz.UserBiz;
import com.ywh.entity.User;
import com.ywh.util.CookieUtil;

public class CommentAction extends BaseAction {
	CommentBiz commentBiz;

	public void setCommentBiz(CommentBiz commentBiz) {
		this.commentBiz = commentBiz;
	}

}
