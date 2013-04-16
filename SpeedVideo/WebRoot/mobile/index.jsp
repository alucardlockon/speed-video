<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>手机首页 - 速播视频 - Html5视频，电影，电视剧，动漫</title>
		<meta http-equiv="keywords"
			content="video,html5,stream,social,speedvideo">
		<meta name="viewport"
			content="width=device-width,minimum-scale=1.0,maximum-scale=1.0" />
		<link href="images/youtube.png" sizes="114x114"
			rel="apple-touch-icon-precomposed">
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/css/styles.css">
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/js/jquery-1.4.3.js">
</script>
	</head>

	<body>
		<div id="body-container">
			<form action="serach!serach">
				<div id="logo-bar">
					<a href="${pageContext.request.contextPath}"><img alt="速播视频"
							src="${pageContext.request.contextPath}/images/youtube.png">
					</a>
					<input type="text" width="100%" value="输入搜索内容" />
					<input type="submit" value="搜索">
				</div>
			</form>
			<div id="main-body">
				<div id="left-list">
					<!-- <ul class="style-of-ul-mobile">
						<li>
							<a href="#">电影</a>
						</li>
						<li>
							<a href="#">电视剧</a>
						</li>
						<li>
							<a href="#">动漫</a>
						</li>
					</ul> -->
				</div>
				<div id="content">
					<div class="video_content">
						<video src="videos/akumo01.mp4" controls="controls"
							preload="preload" width="100%">
						<source type="video/mp4" />
						您的浏览器不支持 video标签，使用
						<a href="https://www.google.com/intl/zh-CN/chrome/browser/">Chorme</a>,
						<a href="http://www.apple.com.cn/safari/">Safari</a>,
						<a href="http://firefox.com.cn/download/">FireFox</a>浏览器获得更好的体验。
						</video>
					</div>
				</div>
				<div id="right-list"></div>
			</div>
			<div id="footer">
				2013毕业制作
			</div>

		</div>
	</body>
</html>
