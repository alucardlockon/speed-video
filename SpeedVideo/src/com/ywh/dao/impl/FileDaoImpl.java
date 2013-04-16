package com.ywh.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ywh.dao.FileDao;
import com.ywh.entity.Video;

public class FileDaoImpl extends HibernateDaoSupport implements FileDao{

	public void save(Video video) {
		this.getHibernateTemplate().save(video);
	}

}
