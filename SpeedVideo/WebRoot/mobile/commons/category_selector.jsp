<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="category_content">
	<select name="video.cid">
		<option value="2">
			----请选择----
		</option>
		<s:iterator value="categories" var="main">
			<option>
				--${name}--
			</option>
			<s:iterator value="#main.subcategory">
				<option value="${id}">
					${name}
				</option>
			</s:iterator>
		</s:iterator>
	</select>
</div>