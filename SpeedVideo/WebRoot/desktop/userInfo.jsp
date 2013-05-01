<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>用户信息 - 速播视频 - Html5视频，电影，电视剧，动漫</title>
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
					<table>
						<tr>
							<td colspan="2">
								<img src="images/${user.photo}" alt="" width="180" height="120" />
								<a href="#">更换头像</a>
							</td>
						</tr>
						<tr>
							<td>
								ID
							</td>
							<td>
								${user.id}
							</td>
						</tr>
						<tr>
							<td>
								用户名
							</td>
							<td>
								${user.name}
							</td>
						</tr>
						<tr>
							<td>
								email
							</td>
							<td>
								<a href="mailto:${user.email}">${user.email}</a>
							</td>
						</tr>
						<tr>
							<td>
								性别
							</td>
							<td>
								${user.gender}
							</td>
						</tr>
						<tr>
							<td>
								视频被观看的总次数:
							</td>
							<td>
								998
							</td>
						</tr>
						<tr>
							<td>
								个人介绍
							</td>
							<td>
								${user.intro}
							</td>
						</tr>
						<tr>
							<td>
								注册时间
							</td>
							<td>

								<s:date name="user.regist_date" format="yyyy年MM月dd日 hh时mm分" />
							</td>
						</tr>
						<tr>
							<td>
								最后登录时间
							</td>
							<td>
								<s:date name="user.last_login" format="yyyy年MM月dd日 hh时mm分" />
							</td>
						</tr>
					</table>
					<div class="userUp">
						<a href="" class="title_text">用户视频</a>
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
					<div id="right-list"></div>
				</div>
				<div id="footer">
					<jsp:include page="../commons/footer.jsp"></jsp:include>
				</div>
			</div>
		</div>
	</body>
</html>
