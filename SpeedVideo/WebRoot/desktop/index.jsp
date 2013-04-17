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
					<s:action name="categoryAction!getCategory" executeResult="true"
						namespace="/">
					</s:action>
				</div>
				<div id="content">
					<s:action name="videoAction!showVideo" executeResult="true"
						namespace="/">
					</s:action>
					<div id="right-list"></div>
				</div>
				<div id="footer">
					<jsp:include page="../commons/footer.jsp"></jsp:include>
				</div>
			</div>
		</div>
	</body>
</html>
