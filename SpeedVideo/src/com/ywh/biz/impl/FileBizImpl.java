package com.ywh.biz.impl;

import com.ywh.biz.FileBiz;
import com.ywh.dao.FileDao;
import com.ywh.entity.Video;

public class FileBizImpl implements FileBiz {
	private FileDao fileDao;

	public void setFileDao(FileDao fileDao) {
		this.fileDao = fileDao;
	}

	public void saveVideo(Video video) {
		fileDao.save(video);
	}

}
