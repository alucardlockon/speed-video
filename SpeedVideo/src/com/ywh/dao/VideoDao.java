package com.ywh.dao;

import java.util.List;

import com.ywh.entity.Video;

public interface VideoDao {

	List<Video> findIndexNew();

	List<Video> findIndexMostComment();

	List<Video> findIndexViews();

	Video findVideoById(int id);

}
