package com.ywh.dao.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ywh.dao.VideoDao;
import com.ywh.entity.Comment;
import com.ywh.entity.User;
import com.ywh.entity.Video;

public class VideoDaoImpl extends HibernateDaoSupport implements VideoDao {
	/**
	 * 查找最新视频
	 */
	public List<Video> findIndexNew(int page, int pageSize) {
		String hql = "from Video order by upload_date desc";
		Query query = getSession().createQuery(hql);
		query.setFirstResult((page-1)*pageSize+1);
		query.setMaxResults(pageSize);
		return query.list();
	}

	/**
	 * 查找最多评论视频
	 */
	public List<Video> findIndexMostComment(int page, int pageSize) {
		// TODO:查询待完成
		String hql = "from Video order by upload_date desc";
		Query query = getSession().createQuery(hql);
		query.setFirstResult((page-1)*pageSize+1);
		query.setMaxResults(pageSize);
		return query.list();
	}

	/**
	 * 查找观看次数最多视频
	 */
	public List<Video> findIndexViews(int page, int pageSize) {
		String hql = "from Video order by views desc";
		Query query = getSession().createQuery(hql);
		query.setFirstResult((page-1)*pageSize+1);
		query.setMaxResults(pageSize);
		return query.list();
	}

	/**
	 * 根据视频id查找视频
	 */
	public Video findVideoById(int id) {
		return (Video) this.getHibernateTemplate().get(Video.class, id);
	}

	/**
	 * 更新用户
	 */
	public void updateViews(Video video) {
		this.getHibernateTemplate().update(video);
	}

	/**
	 * 根据目录id查找目录视频
	 */
	public List<Video> showByCategory(int id) {
		String hql = "from Video where cid=? order by upload_date desc";
		return this.getHibernateTemplate().find(hql, id);
	}

	/**
	 * 搜索
	 */
	public List<Video> findVideoByText(String serachText) {
		String hql = "from Video where title like '%" + serachText
				+ "%' or intro like '%" + serachText + "%' or tag like '%"
				+ serachText + "%' order by upload_date desc";
		return this.getHibernateTemplate().find(hql);
	}

	/**
	 * 根据用户id查询视频id列表
	 */
	public List<Integer> findIdByFavorite(int id,int page,int pageSize) {
		String sql = "select vid from t_favoritelist where uid=:uid";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", id);
		query.setFirstResult((page-1)*pageSize+1);
		query.setMaxResults(pageSize);
		return query.list();
	}

	/**
	 * 根据视频id列表显示视频列表
	 */
	public List<Video> showBylist(List<Integer> idlist) {
		List<Video> list = new ArrayList<Video>();
		for (Integer id : idlist) {
			String hql = "from Video where id=:id";
			Query query = getSession().createQuery(hql);
			query.setInteger("id", id);
			list.add((Video) query.uniqueResult());
		}
		Collections.sort(list, new Comparator<Video>() {
			public int compare(Video o1, Video o2) {
				return (int) (o1.getUpload_date().getTime() - o2
						.getUpload_date().getTime());
			}
		});
		return list;
	}

	/**
	 * 根据视频id和用户id更新t_favoritelist表
	 */
	public void savetoFavByVid(Video video, User user) {
		String sql = "insert into t_favoritelist values (:uid,:vid)";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", user.getId());
		query.setInteger("vid", video.getId());
		query.executeUpdate();
	}

	/**
	 * 根据视频id和用户id查询t_favoritelist表
	 */
	public Object findFavByVid(int uid, int vid) {
		String sql = "select * from t_favoritelist where vid=:vid and uid=:uid";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", uid);
		query.setInteger("vid", vid);
		query.setFirstResult(0);
		query.setMaxResults(4);
		return query.uniqueResult();

	}

	/**
	 * 根据用户id查询视频id
	 */
	public List<Integer> findIdByVideolist(int id,int page,int pageSize) {
		String sql = "select vid from t_videolist where uid=:uid";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", id);
		query.setFirstResult((page-1)*pageSize+1);
		query.setMaxResults(pageSize);
		return query.list();
	}

	/**
	 * 根据视频id查询评论
	 */
	public List<Comment> findByCommentsByVid(int id) {
		String hql = "from Comment where vid=?";
		return this.getHibernateTemplate().find(hql, id);
	}

	public Object findScore(int vid, int uid) {
		String sql = "select score from t_rate where uid=:uid and vid=:vid";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("uid", uid);
		query.setInteger("vid", vid);
		return (Double) query.uniqueResult();
	}

	public Object findTotalScore(int vid) {
		String sql = "select avg(score) from t_rate where vid=:vid";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger("vid", vid);
		return (Double) query.uniqueResult();
	}

}
