<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>注册 - 速播视频 - Html5视频，电影，电视剧，动漫</title>
		<%@include file="../commons/header.jsp"%>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/js/userAgent.js">
</script>
		<script type="text/javascript">
function fcheckpwd() {
	if (document.getElementById('fuserpwd').value == '') {
		alert('密码不能为空')
		return false;
	} else if (document.getElementById('frepassword').value != document
			.getElementById('fuserpwd').value) {
		alert('密码不一致');
		return false;
	} else {
		return true;
	}
}
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
					<div id='regist_block'>
						<form method='post' action='userAction!regist'
							onsubmit='return fcheckpwd()'>
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
										<input type='text' id='fuserpwd' name='user.password'
											style='width: 70%'>
									</td>
								</tr>
								<tr>
									<td>
										重复密码
									</td>
									<td>
										<input type='text' name='repassword' id='frepassword'
											style='width: 70%' onblur='fcheckpwd()'>
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
