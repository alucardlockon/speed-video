package com.ywh.dao;

import java.util.List;

import com.ywh.entity.Comment;
import com.ywh.entity.User;
import com.ywh.entity.Video;

public interface VideoDao {

	List<Video> findIndexNew(int page,int pageSize);

	List<Video> findIndexMostComment(int page,int pageSize);

	List<Video> findIndexViews(int page,int pageSize);

	Video findVideoById(int id);

	void updateViews(Video video);

	List<Video> showByCategory(int id);

	List<Video> findVideoByText(String serachText);

	List<Integer> findIdByFavorite(int id,int page,int pageSize);

	void savetoFavByVid(Video video,User user);

	Object findFavByVid(int uid,int vid);

	List<Integer> findIdByVideolist(int id,int page,int pageSize);

	List<Video> showBylist(List<Integer> idlist);

	List<Comment> findByCommentsByVid(int id,int page,int pageSize);

	Object findScore(int vid, int uid);

	Object findTotalScore(int vid);

	User findCmUser(int uid);

	int findCommentCount();


}
