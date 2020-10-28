
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h5>请添加---</h5>
    <form action="/book/addBook" method="post">
        <div>
        <input type="text" name="bookName" required>
        </div>
        <div>
        <input type="text" name="counts" required>
        </div>
        <div>
        <input type="text" name="detail">
        </div>
        <div>
        <input type="submit" value="提交">
        </div>
    </form>
</div>
</body>
</html>
