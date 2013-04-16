<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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
					<s:action name="categoryAction!getCategory" executeResult="true" namespace="/">
					</s:action>
				</div>
				<div id="content">
					<div class="lastest_content">
						<a href="" class="title_text">最新视频</a>
						<br />
						<table>
							<tr>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/akumo01.png"
											height="120" width="200"> </a>
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/akumo01.png"
											height="120" width="200"> </a>
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/akumo01.png"
											height="120" width="200"> </a>
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/alettertomomo.png"
											height="120" width="200"> </a>
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/next.jpg"
											height="80" width="80"> </a>
								</td>
							</tr>
							<tr>
								<td>
									<a href="#" class="video_title">噩梦小姐01</a>
								</td>
								<td>
									<a href="#" class="video_title">噩梦小姐01</a>
								</td>
								<td>
									<a href="#" class="video_title">噩梦小姐01</a>
								</td>
								<td>
									<a href="#" class="video_title">写给桃子的信</a>
								</td>
							</tr>
						</table>
					</div>
					<div class="most_view_content">
						<a href="" class="title_text">最多观看</a>
						<br />
						<table>
							<tr>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/akumo01.png"
											height="120" width="200"> </a>
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/akumo01.png"
											height="120" width="200"> </a>
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/akumo01.png"
											height="120" width="200"> </a>
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/akumo01.png"
											height="120" width="200"> </a>
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/next.jpg"
											height="80" width="80"> </a>
								</td>
							</tr>
							<tr>
								<td>
									<a href="#" class="video_title">噩梦小姐01</a>
								</td>
								<td>
									<a href="#" class="video_title">噩梦小姐01</a>
								</td>
								<td>
									<a href="#" class="video_title">噩梦小姐01</a>
								</td>
								<td>
									<a href="#" class="video_title">噩梦小姐01</a>
								</td>
							</tr>
						</table>
					</div>
					<div class="comment_content">
						<a href="" class="title_text">最多评论</a>
						<br />
						<table>
							<tr>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/akumo01.png"
											height="120" width="200"> </a>
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/akumo01.png"
											height="120" width="200"> </a>
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/akumo01.png"
											height="120" width="200"> </a>
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/akumo01.png"
											height="120" width="200"> </a>
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/next.jpg"
											height="80" width="80"> </a>
								</td>
							</tr>
							<tr>
								<td>
									<a href="#" class="video_title">噩梦小姐01</a>
								</td>
								<td>
									<a href="#" class="video_title">噩梦小姐01</a>
								</td>
								<td>
									<a href="#" class="video_title">噩梦小姐01</a>
								</td>
								<td>
									<a href="#" class="video_title">噩梦小姐01</a>
								</td>
							</tr>
						</table>
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
