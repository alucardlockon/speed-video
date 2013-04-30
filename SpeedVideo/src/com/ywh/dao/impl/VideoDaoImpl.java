package com.ywh.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ywh.dao.VideoDao;
import com.ywh.entity.Comment;
import com.ywh.entity.User;
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
		String hql = "from Video where title like '%" + serachText
				+ "%' or intro like '%" + serachText + "%' or tag like '%"
				+ serachText + "%' order by upload_date desc";
		return this.getHibernateTemplate().find(hql);
	}

	// TODO:001
	public List<Integer> findIdByFavorite(int id) {
		String sql = "select vid from t_favoritelist where uid=:uid";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", id);
		query.setFirstResult(0);
		query.setMaxResults(4);
		return query.list();
	}

	public List<Video> showBylist(List<Integer> idlist) {
		List<Video> list = new ArrayList<Video>();
		for (Integer id : idlist) {
			String hql = "from Video where id=:id";
			Query query = getSession().createQuery(hql);
			query.setInteger("id", id);
			list.add((Video) query.uniqueResult());
		}
		return list;
	}

	public void savetoFavByVid(Video video, User user) {
		String sql = "insert into t_favoritelist values (:uid,:vid)";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", user.getId());
		query.setInteger("vid", video.getId());
		query.executeUpdate();
	}

	public Object findFavByVid(int uid, int vid) {
		String sql = "select * from t_favoritelist where vid=:vid and uid=:uid";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", uid);
		query.setInteger("vid", vid);
		query.setFirstResult(0);
		query.setMaxResults(4);
		return query.uniqueResult();

	}

	public List<Integer> findIdByVideolist(int id) {
		String sql = "select vid from t_videolist where uid=:uid";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", id);
		query.setFirstResult(0);
		query.setMaxResults(4);
		return query.list();
	}

	public List<Comment> findByCommentsByVid(int id) {
		String hql = "from Comment where vid=?";
		return this.getHibernateTemplate().find(hql, id);
	}

}
