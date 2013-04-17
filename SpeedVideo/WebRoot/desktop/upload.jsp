<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>首页 - 速播视频 - Html5视频，电影，电视剧，动漫</title>

		<%@include file="../commons/header.jsp"%>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/js/file.js">
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
					<div class="file_content">
						<form action="fileAction!upload" method="post"
							enctype="multipart/form-data">
							<table>
								<tr>
									<td>
										选择文件
									</td>
									<td>
										<input type="file" name="upvideo" />
									</td>
								</tr>
								<tr>
									<td>
										标题(不填为默认)
									</td>
									<td>
										<input type="text" name="video.title" />
									</td>
								</tr>
								<tr>
									<td>
										视频介绍
									</td>
									<td>
										<textarea name="video.intro" rows="5"></textarea>
									</td>
								</tr>
								<tr>
									<td>
										标签(用逗号隔开)
									</td>
									<td>
										<input type="text" name="video.tag">
									</td>
								</tr>
								<tr>
									<td>
										<input type="reset" value="清空" />
									</td>
									<td>
										<input type="submit" value="上传">
									</td>
								</tr>
							</table>
							<!--  <input type="hidden" id="hidden_message" name="filemessage"
								value="${filemessage}" />
								-->
						</form>
					</div>
				</div>
				<div id="right-list"></div>
			</div>
			<div id="footer">
				<jsp:include page="../commons/footer.jsp"></jsp:include>
			</div>

		</div>
	</body>
</html>
