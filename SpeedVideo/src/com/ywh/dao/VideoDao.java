package com.ywh.dao;

import java.util.List;

import com.ywh.entity.Comment;
import com.ywh.entity.User;
import com.ywh.entity.Video;

public interface VideoDao {

	List<Video> findIndexNew();

	List<Video> findIndexMostComment();

	List<Video> findIndexViews();

	Video findVideoById(int id);

	void updateViews(Video video);

	List<Video> showByCategory(int id);

	List<Video> findVideoByText(String serachText);

	List<Integer> findIdByFavorite(int id);

	void savetoFavByVid(Video video,User user);

	Object findFavByVid(int uid,int vid);

	List<Integer> findIdByVideolist(int id);

	List<Video> showBylist(List<Integer> idlist);

	List<Comment> findByCommentsByVid(int id);

	Object findScore(int vid, int uid);

	Object findTotalScore(int vid);

}
