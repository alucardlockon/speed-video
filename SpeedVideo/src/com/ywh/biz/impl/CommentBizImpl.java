package com.ywh.biz.impl;

import com.ywh.biz.CommentBiz;
import com.ywh.dao.CommentDao;

public class CommentBizImpl implements CommentBiz{
	CommentDao commentDao;

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}
}
