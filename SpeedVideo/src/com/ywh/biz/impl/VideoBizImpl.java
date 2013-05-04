package com.ywh.biz.impl;

import java.util.List;

import com.ywh.biz.VideoBiz;
import com.ywh.dao.VideoDao;
import com.ywh.entity.Comment;
import com.ywh.entity.User;
import com.ywh.entity.Video;

public class VideoBizImpl implements VideoBiz {
	VideoDao videoDao;

	public void setVideoDao(VideoDao videoDao) {
		this.videoDao = videoDao;
	}

	public List<Video> getIndexMostComment(int page,int pageSize) {
		return videoDao.findIndexMostComment(page,pageSize);
	}

	public List<Video> getIndexNew(int page,int pageSize) {
		return videoDao.findIndexNew(page,pageSize);
	}

	public List<Video> getIndexViews(int page,int pageSize) {
		return videoDao.findIndexViews(page,pageSize);
	}

	public Video getVideoPlay(int id) {
		return videoDao.findVideoById(id);
	}

	public void updateViews(Video video) {
		video.setViews(video.getViews()+1);
		videoDao.updateViews(video);
	}

	public List<Video> showByCategory(int id) {
		return videoDao.showByCategory(id);
	}

	public List<Video> serach(String serachText) {
		return videoDao.findVideoByText(serachText);
	}

	public List<Integer> findIdByFavorite(User user,int page,int pageSize) {
		return videoDao.findIdByFavorite(user.getId(),page,pageSize);
	}

	public void addtoFav(int id,User user) {
		Video video=videoDao.findVideoById(id);
		videoDao.savetoFavByVid(video,user);
	}

	public Object validFav(int uid,int vid) {
		return videoDao.findFavByVid(uid,vid);
	}

	public List<Integer> findIdByVideolist(User user,int page,int pageSize) {
		return videoDao.findIdByVideolist(user.getId(),page,pageSize);
	}


	public List<Video> showBylist(List<Integer> idlist) {
		return videoDao.showBylist(idlist);
	}

	public List<Comment> getComments(Video video) {
		return videoDao.findByCommentsByVid(video.getId());
	}

	public Object getScore(int vid, int uid) {
		return videoDao.findScore(vid,uid);
	}

	public Object getTotalScore(int vid) {
		return videoDao.findTotalScore(vid);
	}


}
