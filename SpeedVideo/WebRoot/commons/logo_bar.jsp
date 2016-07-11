<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<form action="videoAction!serach">
	<a href="${pageContext.request.contextPath}?p1=1&p2=1&p3=1"><img alt="速播视频"
			src="${pageContext.request.contextPath}/images/title.png"> </a>
	<input type="text" size="80%" name="serach_text" id="serach_text"
		value="输入搜索内容" />
	<input type="submit" value="搜索">
</form>
