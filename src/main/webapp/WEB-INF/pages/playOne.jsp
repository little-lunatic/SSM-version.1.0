<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 蜘蛛啊全是腿儿
  Date: 2020/9/29
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全部书籍展示</title>
</head>
<body>
<h1>书籍id=${book.id}：</h1>
<div>
    <table>
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>counts</th>
            <th>detail</th>
        </tr>
        </thead>
        <tbody>
<%--        <c:forEach var="book" items="${book}">--%>
            <tr>
                <td>${book.id}</td>
                <td>${book.bookName}</td>
                <td>${book.counts}</td>
                <td>${book.detail}</td>
            </tr>
<%--        </c:forEach>--%>
        </tbody>
    </table>
</div>
<a href="/book/findAll">返回书籍列表</a>
</body>
</html>
