package com.ywh.biz.impl;

import java.util.Date;

import com.ywh.biz.CommentBiz;
import com.ywh.dao.CommentDao;
import com.ywh.entity.Comment;
import com.ywh.entity.User;

public class CommentBizImpl implements CommentBiz {
	CommentDao commentDao;

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	public void comment(Comment comment) {
		commentDao.save(comment);
	}

	public void updateCommentlist(User user, Comment comment) {
		commentDao.savetolist(user.getId(),comment.getId());
	}
}
