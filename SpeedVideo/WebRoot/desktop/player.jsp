<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>首页 - 速播视频 - Html5视频，电影，电视剧，动漫</title>

		<%@include file="../commons/header.jsp"%>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/js/userAgent.js">
</script>

	</head>

	<body>
		<div id="body-container">
			<form action="serach!serach">
				<div id="logo-bar">
					<a href="${pageContext.request.contextPath}"><img alt="速播视频"
							src="${pageContext.request.contextPath}/images/title.png">
					</a>
					<input type="text" size="80%" id="serach_text" value="输入搜索内容" />
					<input type="submit" value="搜索">

				</div>
			</form>
			<div id="main-body">
				<div id="left-list">
					<jsp:include page="../commons/left_bar.jsp"></jsp:include>
				</div>
				<div id="content">
					<div class="video_content">
						<video src="${pageContext.request.contextPath}/videos/${video.url}"
							controls="controls" preload="preload" height="240px"
							width="432px">
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
				<jsp:include page="../commons/footer.jsp"></jsp:include>
			</div>

		</div>
	</body>
</html>

