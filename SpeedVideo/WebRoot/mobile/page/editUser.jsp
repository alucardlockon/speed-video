<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>用户信息 - 速播视频 - Html5视频，电影，电视剧，动漫</title>
		<%@include file="../commons/header.jsp"%>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/mobile/js/userAgent.js">

</script>

	</head>

	<body>
		<div id="body-container">
			<div id="logo-bar">
				<jsp:include page="../commons/logo_bar.jsp"></jsp:include>
			</div>
			<div id="main-body">
				<div id="left-list">
					<s:action name="m_categoryAction!getCategory" executeResult="true"
						namespace="/">
					</s:action>
				</div>
				<div id="content">
					<c:if test="${!empty sessionScope.user}">
						<form method="post" action="m_userAction!editintro">
							<table>
								<tr>
									<td colspan="2">
										<img src="${pageContext.request.contextPath}/images/${sessionScope.user.photo}" alt="" width="180"
											height="120" />
									</td>
								</tr>
								<tr>
									<td colspan="2">
										<a href="javascript:" onclick="history.back()">返回</a>
									</td>
								</tr>
								<tr>
									<td>
										ID
									</td>
									<td>
										${sessionScope.user.id}
									</td>
								</tr>
								<tr>
									<td>
										用户名
									</td>
									<td>
										${sessionScope.user.username}
									</td>
								</tr>
								<tr>
									<td>
										email
									</td>
									<td>
										${sessionScope.user.email}
									</td>
								</tr>
								<tr>
									<td>
										个人介绍
									</td>
									<td>
										<textarea rows="5" name="intro">${sessionScope.user.intro}</textarea>
									</td>
								</tr>
								<tr>
									<td>
										<input type="button" onclick="history.back()" value="返回">
									</td>
									<td>
									<input type="submit" value="确定">
									</td>
								</tr>
							</table>
						</form>
					</c:if>
					<div id="right-list"></div>
				</div>
				<div id="footer">
					<jsp:include page="../commons/footer.jsp"></jsp:include>
				</div>
			</div>
		</div>
	</body>
</html>
