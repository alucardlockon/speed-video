package com.ywh.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ywh.dao.VideoDao;
import com.ywh.entity.Video;

public class VideoDaoImpl extends HibernateDaoSupport implements VideoDao {

	public List<Video> findIndexNew() {
		String hql = "from Video order by upload_date desc";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(4);
		return query.list();
	}

	public List<Video> findIndexMostComment() {
		String hql = "from Video order by upload_date desc";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(4);
		return query.list();
	}

	public List<Video> findIndexViews() {
		String hql = "from Video order by upload_date desc";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(4);
		return query.list();
	}

	public Video findVideoById(int id) {
		return (Video) this.getHibernateTemplate().get(Video.class, id);
	}

}
