<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>JESTEM mvc.jsp</h1>
<c:out value="${param.b}"/>

${books}

<table cellpadding="1" cellspacing="2" border="1px solid">
    <tr>
        <th>Id</th>
        <th>Title</th>
    </tr>
    <c:forEach items="${books}" var="book">

        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
        </tr>
    </c:forEach>
</table>

${changedFoo}
</body>
</html>
