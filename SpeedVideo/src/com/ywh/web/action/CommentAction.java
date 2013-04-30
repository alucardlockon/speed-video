package com.ywh.web.action;

import java.util.Date;

import com.ywh.biz.CommentBiz;
import com.ywh.biz.UserBiz;
import com.ywh.entity.Comment;
import com.ywh.entity.User;
import com.ywh.util.CookieUtil;

public class CommentAction extends BaseAction {
	CommentBiz commentBiz;
	Comment comment;

	public String execute() {
		comment.setPostdate(new Date(System.currentTimeMillis()));
		comment.setRow(1);
		commentBiz.comment(comment);
		User user = (User) session.get("user");
		commentBiz.updateCommentlist(user, comment);
		return SUCCESS;
	}

	public void setCommentBiz(CommentBiz commentBiz) {
		this.commentBiz = commentBiz;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

}
