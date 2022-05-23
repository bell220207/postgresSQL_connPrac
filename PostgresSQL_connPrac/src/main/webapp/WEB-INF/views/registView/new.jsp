<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새 도서 등록</title>
</head>
<title>Books NEW</title>
<body>
</head>
<body>
    <div class="container">
        <div class="jumbotron">
            <h1>Books NEW</h1>
        </div>
        <form action="<c:url value="/books" />" method="post">
            <div>
                <label>도서 제목</label>
                <input name="title" type="text">
            </div>
            <div>
                <label class="control-label">저자</label>
                <input name="author" type="text">
            </div>
            <div>
                <label class="control-label">이미지</label>
                <input name="image" type="text">
            </div>
            <button type="submit">전송</button>
        </form>
    </div>
</body>
</html>