package com.ywh.web.action;

import java.io.File;
import java.sql.Date;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.ywh.biz.FileBiz;
import com.ywh.entity.Video;

public class FileAction {
	private File upvideo;
	private String upvideoFileName;// 获取文件名，格式:空间的name属性值+必须以FIleName为后缀
	private String upvideoContentType;// 获取文件类型，格式:控件的name属性值+ContentType为后缀
	private String filemessage;
	private Video video;
	private FileBiz fileBiz;

	public String upload() throws Exception {
		try {
			ServletContext sc = ServletActionContext.getServletContext();
			String path = sc.getRealPath("/videos");
			// commons.io中提供的工具类，拷贝文件
			if (!video.getTitle().trim().isEmpty()) {
				upvideoFileName = video.getTitle() + ".mp4";
			}
			FileUtils.copyFile(upvideo, new File(path, upvideoFileName));// 参数为:原文件，目标文件
			video.setImage(upvideoFileName.substring(0, upvideoFileName
					.lastIndexOf('.'))
					+ ".jpg");
			fileBiz.saveVideoImage(upvideoFileName);
			video.setTitle(upvideoFileName);
			video.setUrl(upvideoFileName);
			video.setUpload_date(new Date(System.currentTimeMillis()));
			video.setViews(0);
			fileBiz.saveVideo(video);
			filemessage = "上传成功";// 设置上传信息
			return "upload";
		} catch (Exception e) {
			e.printStackTrace();
			filemessage = "上传出错,文件类型必须mp4，大小不要超过200m";// 上传出错
			return "upload";
		}
	}

	public File getUpvideo() {
		return upvideo;
	}

	public void setUpvideo(File upvideo) {
		this.upvideo = upvideo;
	}

	public String getUpvideoFileName() {
		return upvideoFileName;
	}

	public void setUpvideoFileName(String upvideoFileName) {
		this.upvideoFileName = upvideoFileName;
	}

	public String getUpvideoContentType() {
		return upvideoContentType;
	}

	public void setUpvideoContentType(String upvideoContentType) {
		this.upvideoContentType = upvideoContentType;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public void setFileBiz(FileBiz fileBiz) {
		this.fileBiz = fileBiz;
	}

	public String getFilemessage() {
		return filemessage;
	}

	public void setFilemessage(String filemessage) {
		this.filemessage = filemessage;
	}

}
