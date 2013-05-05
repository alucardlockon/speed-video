<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="lastest_content">
	<a href="#" class="title_text">${subcategory.name}-${maincategory.name}</a>
	<br />
	<table>
		<s:iterator value="videolist" status="status">
			<tr>
				<s:if test="#status.index!=4&&#status.index!=8&&#status.index!=12">
					<td>
						<a
							href="${pageContext.request.contextPath}/m_videoAction!play?video.id=${id}"><img
								alt="${title}"
								src="${pageContext.request.contextPath}/images/${image}"
								height="120" width="200"> </a>
					</td>
					<td>
						<a
							href="${pageContext.request.contextPath}/m_videoAction!play?video.id=${id}"
							class="video_title">${title}</a>

					</td>
				</s:if>
				<s:else>
					<td>
					</td>
					<td>
					</td>
				</s:else>
			</tr>
		</s:iterator>

	</table>
</div>
