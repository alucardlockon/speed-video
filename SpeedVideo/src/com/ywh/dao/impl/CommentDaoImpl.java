package com.ywh.dao.impl;

import java.util.Date;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ywh.biz.CommentBiz;
import com.ywh.dao.CommentDao;
import com.ywh.entity.Comment;

public class CommentDaoImpl extends HibernateDaoSupport implements CommentDao {
	/**
	 * 保存评论
	 */
	public void save(Comment comment) {
		this.getHibernateTemplate().save(comment);
	}

	/**
	 * 更新t_commentlist表
	 */
	public void savetolist(int uid, int cid) {
		String sql = "insert into t_commentlist values (:uid,:cid)";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", uid);
		query.setInteger("cid", cid);
		query.executeUpdate();
	}

	/**
	 * 更新分数
	 */
	public void insertRate(int score, int vid, int uid) {
		String sql = "insert into t_rate values (:uid,:vid,:score)";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", uid);
		query.setInteger("vid", vid);
		query.setInteger("score", score);
		query.executeUpdate();
	}

	public void updateRate(int score, int vid, int uid) {
		String sql = "update t_rate set score=:score where uid=:uid and vid=:vid";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", uid);
		query.setInteger("vid", vid);
		query.setInteger("score", score);
		query.executeUpdate();
	}

	public Object findRate(int vid, int uid) {
		String sql = "select * from t_rate where uid=:uid and vid=:vid";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", uid);
		query.setInteger("vid", vid);
		return query.uniqueResult();
	}

}
