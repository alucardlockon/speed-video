package com.ywh.biz.impl;

import java.util.List;

import com.ywh.biz.VideoBiz;
import com.ywh.dao.VideoDao;
import com.ywh.entity.Video;

public class VideoBizImpl implements VideoBiz {
	VideoDao videoDao;

	public void setVideoDao(VideoDao videoDao) {
		this.videoDao = videoDao;
	}

	public List<Video> getIndexMostComment() {
		return videoDao.findIndexMostComment();
	}

	public List<Video> getIndexNew() {
		return videoDao.findIndexNew();
	}

	public List<Video> getIndexViews() {
		return videoDao.findIndexViews();
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


}
