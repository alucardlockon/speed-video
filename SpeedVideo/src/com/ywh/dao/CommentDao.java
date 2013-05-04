package com.ywh.dao;

import java.util.Date;

import com.ywh.entity.Comment;

public interface CommentDao {

	void save(Comment comment);

	void savetolist(int uid, int cid);

	void updateRate(int score, int vid, int id);
	
	void insertRate(int score, int vid, int uid);

	Object findRate(int vid, int id);
}
