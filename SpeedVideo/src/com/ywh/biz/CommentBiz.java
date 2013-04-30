package com.ywh.biz;

import java.util.Date;

import com.ywh.entity.Comment;
import com.ywh.entity.User;

public interface CommentBiz {

	void comment(Comment comment);

	void updateCommentlist(User user, Comment comment);

}
