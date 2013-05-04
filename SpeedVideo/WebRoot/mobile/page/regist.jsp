<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>首页 - 速播视频 - Html5视频，电影，电视剧，动漫</title>
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
					<div id='regist_block'>
						<form method='post' action='m_userAction!regist'>
							<table>
								<tr>
									<td>
										用户名
									</td>
									<td>
										<input type='text' name='user.username' style='width: 70%'>
									</td>
								</tr>
								<tr>
									<td>
										密码
									</td>
									<td>
										<input type='text' name='user.password' style='width: 70%'>
									</td>
								</tr>
								<tr>
									<td>
										重复密码
									</td>
									<td>
										<input type='text' name='repassword' style='width: 70%'>
									</td>
								</tr>
								<tr>
									<td>
										真实姓名
									</td>
									<td>
										<input type='text' name='user.name' style='width: 70%'>
									</td>
								</tr>
								<tr>
									<td>
										电子邮箱
									</td>
									<td>
										<input type='text' name='user.email' style='width: 70%'>
									</td>
								</tr>
								<tr>
									<td>
										性别
									</td>
									<td>
										<input type="radio" name='user.gender' value='保密'
											checked="checked" />
										保密
										<input type="radio" name='user.gender' value='男' />
										男
										<input type="radio" name='user.gender' value='女' />
										女
									</td>
								</tr>
								<tr>
									<td>
										验证码
									</td>
									<td>
										<input type='text' name='validcode' style='width: 70%'>
									</td>
								</tr>
								<tr>
									<td>
										<input type='reset' value='重置' />
									</td>
									<td>
										<input type='submit' value='注册' />
									</td>
								</tr>
							</table>
						</form>
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
