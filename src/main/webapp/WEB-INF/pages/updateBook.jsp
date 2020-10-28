<%--
  Created by IntelliJ IDEA.
  User: 蜘蛛啊全是腿儿
  Date: 2020/10/1
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h5>--请修改---</h5>
<form action="/book/updateBook" method="post" >
    <div>
        <input type="hidden" name="id" value="${book.id}">
    </div>
    <div>
        <input type="text" name="bookName" value="${book.bookName}">
    </div>
    <div>
        <input type="text" name="counts" value="${book.counts}">
    </div>
    <div>
        <input type="text" name="detail" value="${book.detail}">
    </div>
    <div>
        <input type="submit" value="提交">
    </div>
</form>
</body>
</html>
