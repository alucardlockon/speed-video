package com.ywh.web.action;

import java.util.List;

import com.ywh.biz.VideoBiz;
import com.ywh.entity.Video;

public class VideoAction {
	VideoBiz videoBiz;
	List<Video> news;
	List<Video> views;
	List<Video> mostComments;
	Video video;

	public String showVideo() {
		news = videoBiz.getIndexNew();
		views = videoBiz.getIndexViews();
		mostComments = videoBiz.getIndexMostComment();
		return "showVideo";
	}

	public String play() {
		video=videoBiz.getVideoPlay(video.getId());
		return "play";
	}

	public void setVideoBiz(VideoBiz videoBiz) {
		this.videoBiz = videoBiz;
	}

	public List<Video> getNews() {
		return news;
	}

	public void setNews(List<Video> news) {
		this.news = news;
	}

	public List<Video> getViews() {
		return views;
	}

	public void setViews(List<Video> views) {
		this.views = views;
	}

	public List<Video> getMostComments() {
		return mostComments;
	}

	public void setMostComments(List<Video> mostComments) {
		this.mostComments = mostComments;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

}
