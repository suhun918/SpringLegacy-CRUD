<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list 페이지</title>
</head>
<body>
	<div id = 'content'>
		<table border="1">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>날짜</th>
			</tr>
			<c:forEach var="post" items="${posts}">
				<tr>
					<td>${post.id}</td>
					<td><a href = "/post/detail.do?id=${post.id}">${post.title}</a></td>
					<td>${post.createDate}</td>
				</tr>
			</c:forEach>
		</table>
		<a href ="/post/writeForm.do">글쓰기</a>
	</div>
</body>
</html>