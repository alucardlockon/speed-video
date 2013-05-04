package com.ywh.web.action;

import java.util.Date;

import com.ywh.biz.CommentBiz;
import com.ywh.biz.UserBiz;
import com.ywh.entity.Comment;
import com.ywh.entity.User;
import com.ywh.util.CookieUtil;

/**
 * 评论Action，负责评论部分
 * @author YWH
 */
public class CommentAction extends BaseAction {
	CommentBiz commentBiz;
	Comment comment;
	int score;
	int vid;
	
	/**
	 * 进行评论
	 */
	public String execute() {
		comment.setPostdate(new Date(System.currentTimeMillis()));
		// comment.setRow(1);
		User user = (User) session.get("user");
		comment.setUid(user.getId());
		commentBiz.comment(comment);
		return SUCCESS;
	}
	/**
	 * 打分
	 */
	public String rate(){
		User user = (User) session.get("user");
		commentBiz.rate(score,vid,user);
		return "rate";
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	
}
