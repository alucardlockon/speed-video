<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<form action="m_videoAction!serach">
	<a href="${pageContext.request.contextPath}/!tomobile"><img
			alt="速播视频" src="${pageContext.request.contextPath}/images/title.png">
	</a>
	<br/>
	<a id="floatmenu" href='#'><img
			src="${pageContext.request.contextPath}/images/menu.png" /> </a>
	<input type="text" name="serach_text" id="serach_text" value="输入搜索内容"
		style="width: 70%" />
	<input type="submit" value="搜索">
</form>
