<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="floatdiv">
	<ul class="style-of-ul">
		<li>
			<a href="${pageContext.request.contextPath}/!tomobile">首页</a>
		</li>
		<c:if test="${!empty sessionScope.user}" var="rs">
			<li>
				<a href="m_userAction!userinfo?user.id=${sessionScope.user.id}">欢迎,${sessionScope.user.username}</a>
			</li>
			<li>
				<a href="m_userAction!exitlogin" id="exitlogin">退出登录</a>
			</li>
			<li>
				<a href="m_videoAction!favlist?page=1&pageSize=3">我的最爱</a>
			</li>
			<li>
				<a href="${pageContext.request.contextPath}/mobile/page/upload.jsp">视频上传</a>
			</li>
		</c:if>
		<c:if test="${!rs}">
			<li>
				<a href="#" id="regist">快速注册</a>
			</li>
			<li>
				<a href="#" id="login">快速登录</a>
			</li>
		</c:if>
		<s:iterator value="categories" var="main">
			<li>
				<a href="#" class="subli" id="u${id}">${name}</a>
				<ul class="style-of-subul_u${id}">

					<s:iterator value="#main.subcategory">
						<li>
							<a
								href="m_videoAction!showByCategory?subcategory.id=${id}&maincategory.id=${main.id}">${name}</a>
						</li>
					</s:iterator>
				</ul>
			</li>
		</s:iterator>
	</ul>
</div>