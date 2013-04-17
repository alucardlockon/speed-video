package com.ywh.biz;

import java.util.List;

import com.ywh.entity.Video;

public interface VideoBiz {

	List<Video> getIndexNew();

	List<Video> getIndexMostComment();

	List<Video> getIndexViews();

	Video getVideoPlay(int id);

}
