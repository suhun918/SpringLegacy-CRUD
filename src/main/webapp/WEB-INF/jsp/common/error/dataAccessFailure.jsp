<%--

  Class Name : dataAccessFailure.jsp
  Description : 에러화면
  Modification Information
 
       수정일         	    수정자                  수정내용
  	  ------          --------           ---------
	2017.12.08     	   joDh               최초 생성
 
    author   : joDh
    since    : 2017.12.08

--%>

<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=Edge"/>
<title>M4Potal - Error!!! </title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" type="text/css" media="screen" href="${contextPath}/resources/css/error.css">
<script type="text/javascript">
	function fnGoAfterErrorPage(){
		history.back(-2);
	}
</script>
</head>

<body>
	<div class="err-wrap">
		<div class="err">
			<a href="javascript:fnGoAfterErrorPage();"><img src="${contextPath}/resources/images/error/img_err.png" alt="에러 이미지" /></a>
			<h2>오류가 발생하였습니다.</h2>
			
			<span>데이터 접근 중 오류가 발생했습니다.</span>
			<button onclick="fnGoAfterErrorPage();">이전 페이지</button>
		</div>
	</div>
</body>
</html>