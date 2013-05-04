package com.ywh.dao;

import com.ywh.entity.User;
import com.ywh.entity.Video;

public interface FileDao {

	void save(Video video);

	void savetoVideolist(User user, Video video);


}
