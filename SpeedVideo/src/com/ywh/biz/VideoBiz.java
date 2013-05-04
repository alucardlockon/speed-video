package com.ywh.biz;

import java.util.List;

import com.ywh.entity.Comment;
import com.ywh.entity.User;
import com.ywh.entity.Video;

public interface VideoBiz {

	List<Video> getIndexNew(int page,int pageSize);

	List<Video> getIndexMostComment(int page,int pageSize);

	List<Video> getIndexViews(int page,int pageSize);

	Video getVideoPlay(int id);

	void updateViews(Video video);

	List<Video> showByCategory(int id);

	List<Video> serach(String serachText);

	public List<Integer> findIdByFavorite(User user,int page,int pageSize);

	void addtoFav(int id, User user);

	Object validFav(int uid, int vid);

	List<Integer> findIdByVideolist(User user,int page,int pageSize);

	List<Video> showBylist(List<Integer> idlist2);

	List<Comment> getComments(Video video);

	Object getScore(int id, int id2);

	Object getTotalScore(int id);

}
