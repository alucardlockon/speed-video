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
			<div id="logo-bar">
				<jsp:include page="../commons/logo_bar.jsp"></jsp:include>
			</div>
			<div id="main-body">
				<div id="left-list">
					<s:action name="categoryAction!getCategory" executeResult="true"
						namespace="/">
					</s:action>
				</div>
				<div id="content">
					<div class="myFav">
						<a href="" class="title_text">我的最爱</a>
						<br />
						<table>
							<tr>
								<s:iterator value="videolist" var="video">
									<td>
										<a
											href="${pageContext.request.contextPath}/videoAction!play?video.id=${id}"><img
												alt="${title}"
												src="${pageContext.request.contextPath}/images/${image}"
												height="120" width="200"> </a>
									</td>
								</s:iterator>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/next.jpg"
											height="80" width="80"> </a>
								</td>
							</tr>
							<tr>
								<s:iterator value="videolist" var="video">
									<td>
										<a
											href="${pageContext.request.contextPath}/videoAction!play?video.id=${id}"
											class="video_title">${title}</a>
									</td>

								</s:iterator>
								<td>
								</td>
							</tr>
						</table>
					</div>
					<div class="myUp">
						<a href="" class="title_text">我的上传</a>
						<br />
						<table>
							<tr>
								<s:iterator value="videolist2" var="video">
									<td>
										<a
											href="${pageContext.request.contextPath}/videoAction!play?video.id=${id}"><img
												alt="${title}"
												src="${pageContext.request.contextPath}/images/${image}"
												height="120" width="200"> </a>
									</td>
								</s:iterator>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/next.jpg"
											height="80" width="80"> </a>
								</td>
							</tr>
							<tr>
								<s:iterator value="videolist2" var="video">
									<td>
										<a
											href="${pageContext.request.contextPath}/videoAction!play?video.id=${id}"
											class="video_title">${title}</a>
									</td>

								</s:iterator>
								<td>
								</td>
							</tr>
						</table>
					</div>
					<div class="myCom">
						<a href="" class="title_text">最近评论</a>
						<br />
						<table>
							<tr>
								<s:iterator value="videolist3" var="video">
									<td>
										<a
											href="${pageContext.request.contextPath}/videoAction!play?video.id=${id}"><img
												alt="${title}"
												src="${pageContext.request.contextPath}/images/${image}"
												height="120" width="200"> </a>
									</td>
								</s:iterator>
								<td>
									<a href="${pageContext.request.contextPath}/desktop/player.jsp"><img
											alt="影片名称"
											src="${pageContext.request.contextPath}/images/next.jpg"
											height="80" width="80"> </a>
								</td>
							</tr>
							<tr>
								<s:iterator value="videolist3" var="video">
									<td>
										<a
											href="${pageContext.request.contextPath}/videoAction!play?video.id=${id}"
											class="video_title">${title}</a>
									</td>

								</s:iterator>
								<td>
								</td>
							</tr>
						</table>
					</div>
					<div id="right-list"></div>
				</div>
				<div id="footer">
					<jsp:include page="../commons/footer.jsp"></jsp:include>
				</div>
			</div>
		</div>
	</body>
</html>
