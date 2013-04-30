package com.ywh.web.action;

import java.util.List;

import com.ywh.biz.CategoryBiz;
import com.ywh.biz.VideoBiz;
import com.ywh.entity.Category;
import com.ywh.entity.Comment;
import com.ywh.entity.User;
import com.ywh.entity.Video;

public class VideoAction extends BaseAction {
	private VideoBiz videoBiz;
	private CategoryBiz categoryBiz;
	private List<Video> videolist;
	private List<Video> videolist2;
	private List<Video> videolist3;
	private List<Comment> comments;
	private Video video;
	private Category subcategory;// 分类
	private Category maincategory;// 上一层分类
	private String serach_text;// 搜索关键字

	public String showVideo() {
		videolist = videoBiz.getIndexNew();
		videolist2 = videoBiz.getIndexViews();
		videolist3 = videoBiz.getIndexMostComment();
		return "showVideo";
	}

	public String play() {
		video = videoBiz.getVideoPlay(video.getId());
		videoBiz.updateViews(video);
		comments=videoBiz.getComments(video);
		return "play";
	}

	// TODO:等待排版完善前用listview表示....
	public String showByCategory() {
		subcategory = categoryBiz.getCategoryById(subcategory.getId());
		maincategory = categoryBiz.getCategoryById(maincategory.getId());
		videolist = videoBiz.showByCategory(subcategory.getId());
		return "showByCategory";
	}

	public String favlist() {
		User user = (User) session.get("user");
		List<Integer> idlist = videoBiz.findIdByFavorite(user);
		List<Integer> idlist2 = videoBiz.findIdByVideolist(user);
		List<Integer> idlist3 = videoBiz.findIdByFavorite(user);
		videolist = videoBiz.showBylist(idlist);
		videolist2 = videoBiz.showBylist(idlist2);
		videolist3 = videoBiz.showBylist(idlist2);
		return "favlist";
	}

	public String addtoFav() {
		User user = (User) session.get("user");
		Object valid=videoBiz.validFav(user.getId(),video.getId());
		if(valid==null){
		videoBiz.addtoFav(video.getId(),user);
		}
		return "addtoFav" ;
	}

	/**
	 * 搜索
	 */
	public String serach() {
		videolist = videoBiz.serach(serach_text);
		return "showByCategory";
	}

	public void setVideoBiz(VideoBiz videoBiz) {
		this.videoBiz = videoBiz;
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

	public List<Video> getVideolist2() {
		return videolist2;
	}

	public void setVideolist2(List<Video> videolist2) {
		this.videolist2 = videolist2;
	}

	public List<Video> getVideolist3() {
		return videolist3;
	}

	public void setVideolist3(List<Video> videolist3) {
		this.videolist3 = videolist3;
	}

	public VideoBiz getVideoBiz() {
		return videoBiz;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
