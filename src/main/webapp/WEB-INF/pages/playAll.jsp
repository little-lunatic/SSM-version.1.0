<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>全部书籍展示</title>
</head>
<body>
<h1>全部书籍：</h1>
<div align="centre">
    <table style="border: aqua" border="1">
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
          <c:forEach var="book" items="${books}">
              <tr>
                  <td>${book.id}</td>
                  <td>${book.bookName}</td>
                  <td>${book.counts}</td>
                  <td>${book.detail}</td>
                  <td>
                      <a href="/book/toUpdatePage?id=${book.id}">修改</a>
                      &nbsp;|&nbsp;
                      <a href="/book/deleteBook?id=${book.id}">删除</a>
                  </td>
              </tr>
          </c:forEach>
        </tbody>
    </table>
</div>


<div>
<h5>通过id查找一本书,请输入id：</h5>
<form action="/book/findById" method="post">

    <input type="text" name="id">
    <input type="submit" value="提交">
</form>
</div>

<div>
    <a href="/book/toAddPage">新增书籍</a>
</div>

</body>
</html>
