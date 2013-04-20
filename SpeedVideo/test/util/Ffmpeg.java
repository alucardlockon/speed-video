package util;

import java.io.IOException;

public class Ffmpeg {

	public static void main(String[] args) {
		// 视频文件
		String videoRealPath = "D://编程/apache-tomcat-6.0.36/webapps/SpeedVideo/videos/aaaa.mp4";
		// 截图的路径（输出路径）
		String imageRealPath = "D://编程/apache-tomcat-6.0.36/webapps/SpeedVideo/images/asdss.jpg";
		String cmd = "cmd /c start D:/编程/apache-tomcat-6.0.36/ffmpeg.bat";
		// videoRealPath.replaceAll("\\\\", "/");
		// imageRealPath.replaceAll("\\\\", "/");
		// cmd.replaceAll("\\\\", "/");
		try {
			// 调用批处理文件
			Runtime.getRuntime().exec(
					cmd + " " + videoRealPath + " " + imageRealPath);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}