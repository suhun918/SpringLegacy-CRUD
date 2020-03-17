<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="content">
		<form action="/post/update.do" method="post">
			<input type="hidden" name="id" value="${post.id}" />
			<input  type="text" value="${post.title}" name="title" placeholder="title" /><br />
			<textarea rows="5" cols="20" name="content">
				${post.content}
	  		</textarea>
			<br /> <input type="submit" value="수정" />
		</form>
	</div>
</body>
</html>