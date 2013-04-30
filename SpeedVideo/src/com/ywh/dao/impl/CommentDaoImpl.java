package com.ywh.dao.impl;

import java.util.Date;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ywh.biz.CommentBiz;
import com.ywh.dao.CommentDao;
import com.ywh.entity.Comment;

public class CommentDaoImpl extends HibernateDaoSupport implements CommentDao {

	public void save(Comment comment) {
		this.getHibernateTemplate().save(comment);
	}

	public void savetolist(int uid, int cid) {
		String sql = "insert into t_commentlist values (:uid,:cid)";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", uid);
		query.setInteger("cid", cid);
		query.executeUpdate();
	}
	

}
