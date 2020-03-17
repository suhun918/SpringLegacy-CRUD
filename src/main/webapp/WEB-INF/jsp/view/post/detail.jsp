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
		제목 : ${post.title}<br/>
		작성자 아이디 : ${post.userId}<br/>
		내용 : ${post.content}<br/>
<a href ="/post/updateForm.do?id=${post.id}">수정하기</a>
<a href ="/post/delete.do?id=${post.id}">삭제하기</a>
	</div>
</body>
</html>