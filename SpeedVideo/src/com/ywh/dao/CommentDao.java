package com.ywh.dao;

import java.util.Date;

import com.ywh.entity.Comment;

public interface CommentDao {

	void save(Comment comment);

	void savetolist(int uid, int cid);

}
