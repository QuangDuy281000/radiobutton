<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22/6/2021
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<form action="" method="post">
    <c:forEach items="listquestion" var="l">
        <p>${l.number}.${l.question}</p>
          <input type="radio" name="ans[${l.number}]" value="A">${l.option1}
        <br>
          <input type="radio" name="ans[${l.number}]" value="B">${l.option2}
        <br>
          <input type="radio" name="ans[${l.number}]" value="C">${l.option3}
        <br>
        <input type="radio" name="ans[${l.number}]" value="D">${l.option4}
        <br>
    </c:forEach>
    <input type="submit" value="ENTER">
</form>

</body>
</html>
