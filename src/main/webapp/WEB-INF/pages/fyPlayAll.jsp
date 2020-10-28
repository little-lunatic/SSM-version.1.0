<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 蜘蛛啊全是腿儿
  Date: 2020/10/22
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>分页查找</title>
</head>
<body>
<div style="align-content: center">
    <table style="border: darkblue" border="1">
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>counts</th>
            <th>detail</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="page" items="${pageInfo.list}">
            <tr>
                <td>${page.id}</td>
                <td>${page.bookName}</td>
                <td>${page.counts}</td>
                <td>${page.detail}</td>
                <td>
                    <a href="/book/toUpdatePage?id=${page.id}">修改</a>
                    &nbsp;|&nbsp;
                    <a href="/book/deleteBook?id=${page.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div style="text-align: center">
        <p>
            当前页${pageInfo.pageNum},总页数${pageInfo.pages},总记录${pageInfo.total}.
        </p>

        <a href="?pageNum=${pageInfo.firstPage}">首页</a>

        <c:if test="${pageInfo.hasPreviousPage}">
            <a href="?pageNum=${pageInfo.pageNum-1}">上一页</a>
        </c:if>

        <c:if test="${pageInfo.hasNextPage}">
            <a href="?pageNum=${pageInfo.pageNum+1}">下一页</a>
        </c:if>
        <a href="?pageNum=${pageInfo.lastPage}">尾页</a>

    </div>
</div>

</body>

</html>