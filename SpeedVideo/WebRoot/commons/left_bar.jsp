<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<ul class="style-of-ul">
	<li>
		<a href="#" id="regist">注册</a>
	</li>
	<li>
		<a href="#" id="login">登录</a>
	</li>
	<li>
		<a href="#">我的最爱</a>
	</li>
	<li>
		<a href="${pageContext.request.contextPath}/desktop/upload.jsp">视频上传</a>
	</li>
	<s:iterator value="categories" var="main">
		<li>
			<a href="#" class="subli" id="u${id}">${name}</a>
			<ul class="style-of-subul_u${id}">
			
				<s:iterator value="#main.subcategory">
					<li>
						<a href="categoryAction!showContent?id=${id}">${name}</a>
					</li>
				</s:iterator>
			</ul>
		</li>
	</s:iterator>
</ul>