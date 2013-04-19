package com.ywh.web.action;

import java.util.List;

import com.ywh.biz.CategoryBiz;
import com.ywh.biz.VideoBiz;
import com.ywh.entity.Category;
import com.ywh.entity.Video;

public class VideoAction {
	private VideoBiz videoBiz;
	private CategoryBiz categoryBiz;
	private List<Video> news;
	private List<Video> views;
	private List<Video> mostComments;
	private List<Video> videolist;
	private Video video;
	private Category subcategory;// 分类
	private Category maincategory;// 上一层分类
	private String serach_text;// 搜索关键字

	public String showVideo() {
		news = videoBiz.getIndexNew();
		views = videoBiz.getIndexViews();
		mostComments = videoBiz.getIndexMostComment();
		return "showVideo";
	}

	public String play() {
		video = videoBiz.getVideoPlay(video.getId());
		videoBiz.updateViews(video);
		return "play";
	}

	// TODO:等待排版完善前用listview表示....
	public String showByCategory() {
		subcategory = categoryBiz.getCategoryById(subcategory.getId());
		maincategory = categoryBiz.getCategoryById(maincategory.getId());
		videolist = videoBiz.showByCategory(subcategory.getId());
		return "showByCategory";
	}

	/**
	 * 搜索
	 */
	public String serach() {
		videolist=videoBiz.serach(serach_text);
		return "showByCategory";
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

	public List<Video> getVideolist() {
		return videolist;
	}

	public void setVideolist(List<Video> videolist) {
		this.videolist = videolist;
	}

	public Category getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(Category subcategory) {
		this.subcategory = subcategory;
	}

	public void setCategoryBiz(CategoryBiz categoryBiz) {
		this.categoryBiz = categoryBiz;
	}

	public Category getMaincategory() {
		return maincategory;
	}

	public void setMaincategory(Category maincategory) {
		this.maincategory = maincategory;
	}

	public String getSerach_text() {
		return serach_text;
	}

	public void setSerach_text(String serachText) {
		serach_text = serachText;
	}

}
