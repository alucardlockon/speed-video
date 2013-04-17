package com.ywh.biz.impl;

import java.io.IOException;

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

	/**
	 * 保存文件缩略图
	 */
	public void saveVideoImage(String fileName) {
		// 视频文件
		String str = fileName.substring(0, fileName.lastIndexOf('.'));
		String videoRealPath = "D://编程/apache-tomcat-6.0.36/webapps/SpeedVideo/videos/"
				+ str + ".mp4";
		// 截图的路径（输出路径）
		String imageRealPath = "D://编程/apache-tomcat-6.0.36/webapps/SpeedVideo/images/"
				+ str + ".jpg";
		String cmd = "cmd /c start D:/编程/apache-tomcat-6.0.36/ffmpeg.bat";
		try {
			// 调用批处理文件
			Runtime.getRuntime().exec(
					cmd + " " + videoRealPath + " " + imageRealPath);

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
	}

}
