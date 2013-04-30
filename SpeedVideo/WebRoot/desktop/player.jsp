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
					<span id="videotitle">${video.title}</span>
					<div class="video_content">
						<video
							src="${pageContext.request.contextPath}/videos/${video.url}"
							controls="controls" preload="preload" height="240px"
							width="432px">
						<source type="video/mp4" />
						您的浏览器不支持 video标签，使用
						<a href="https://www.google.com/intl/zh-CN/chrome/browser/">Chorme</a>,
						<a href="http://www.apple.com.cn/safari/">Safari</a>,
						<a href="http://firefox.com.cn/download/">FireFox</a>浏览器获得更好的体验。
						</video>
					</div>
					<input type="button" value="喜欢"
						onclick="location='videoAction!addtoFav?video.id=${video.id}'" />
					<br />
					影片简介:
					<br />
					&nbsp;&nbsp;&nbsp;&nbsp;${video.intro}
					<br />
					<span id="comment">评论数:0</span>
					<br />
					<span id="views">观看数:${video.views}</span>
					<br />
					评论:
					<blockquote style="">
					<s:iterator value="comments">
						<table>
							<thead>
								<tr>
									<th>
										用户:<a href="#">${id}</a>
									</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>
										${content}
									</td>
								</tr>
							</tbody>
							<tfoot>
							</tfoot>
						</table>
					</s:iterator>
					</blockquote>
					<div id="comment_form">
						<c:if test="${!empty sessionScope.user}" var="rs">
							<form action="commentAction">
								<textarea rows="5" name="comment.content" style="width: 40%"></textarea>
								<br />
								<input type="submit" value="我要评论" />
								<input type="hidden" name="comment.vid" value="${video.id}">
							</form>
						</c:if>
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

