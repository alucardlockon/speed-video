package com.ywh.biz;

import java.util.List;

import com.ywh.entity.Comment;
import com.ywh.entity.User;
import com.ywh.entity.Video;

public interface VideoBiz {

	List<Video> getIndexNew();

	List<Video> getIndexMostComment();

	List<Video> getIndexViews();

	Video getVideoPlay(int id);

	void updateViews(Video video);

	List<Video> showByCategory(int id);

	List<Video> serach(String serachText);

	public List<Integer> findIdByFavorite(User user);

	void addtoFav(int id, User user);

	Object validFav(int uid, int vid);

	List<Integer> findIdByVideolist(User user);

	List<Video> showBylist(List<Integer> idlist2);

	List<Comment> getComments(Video video);

	Object getScore(int id, int id2);

	Object getTotalScore(int id);

}
