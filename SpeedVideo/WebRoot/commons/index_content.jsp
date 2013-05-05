<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="lastest_content">
	<a href="" class="title_text">最新视频</a>
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
				<a href="${pageContext.request.contextPath}/mainAction?p1=${p1+1}"><img
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
<div class="most_view_content">
	<a href="" class="title_text">最多观看</a>
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
				<a href="${pageContext.request.contextPath}/mainAction?p2=${p2+1}"><img
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
<div class="comment_content">
	<a href="" class="title_text">最多评论</a>
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
				<a href="${pageContext.request.contextPath}/mainAction?p3=${p3+1}"><img
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
