<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="keywords"
	content="video,html5,stream,social,speedvideo">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/styles.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.4.3.js">
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/mainjs.js">
</script>
<script type="text/javascript">
$(function() {
	$('#regist')
			.toggle(
					function() {
						$(this)
								.after(
										"<div id='regist_block'><form method='post' action='userAction!quickRegist'><table><tr><td>用户名</td></tr><tr><td><input type='text' name='user.username' style='width:70%'></td></tr><tr><td>密码</td></tr><td><input type='text' name='user.password'  style='width:70%'></td></tr><tr><td>重复密码</td></tr><tr><td><input type='text' name='repassword'  style='width:70%'></td></tr><tr><td><input type='submit' value='注册'/></td></tr><tr><td><small><a href='${pageContext.request.contextPath}/desktop/regist.jsp'>完整注册</a></small></td></tr></table></form></div>");
					}, function() {
						$('#regist_block').remove();
					});
});

$(function() {
	$('#login')
			.toggle(
					function() {
						$(this)
								.after(
										"<div id='login_block'><form method='post' action='userAction!quickLogin'><table><tr><td>用户名</td></tr><tr><td><input type='text' name='user.username' value='${cookie.username.value}' style='width:70%'></td></tr><tr><td>密码</td></tr><tr><td><input type='text' name='user.password' value='${cookie.password.value}'  style='width:70%'></td></tr><tr><td><input type='submit' value='登陆'/></td></tr></table></form></div>");
					}, function() {
						$('#login_block').remove();
					});
});

</script>


