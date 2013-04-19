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
		// TODO:²éÑ¯´ýÍê³É
		String hql = "from Video order by upload_date desc";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(4);
		return query.list();
	}

	public List<Video> findIndexViews() {
		String hql = "from Video order by views desc";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(4);
		return query.list();
	}

	public Video findVideoById(int id) {
		return (Video) this.getHibernateTemplate().get(Video.class, id);
	}

	public void updateViews(Video video) {
		this.getHibernateTemplate().update(video);
	}

	public List<Video> showByCategory(int id) {
		String hql = "from Video where cid=?";
		return this.getHibernateTemplate().find(hql, id);
	}

	public List<Video> findVideoByText(String serachText) {
		String hql = "from Video where title='%" + serachText
				+ "%' or intro like '%" + serachText + "%' or tag like '%"
				+ serachText + "%' order by upload_date desc";
		return this.getHibernateTemplate().find(hql);
	}

}
