<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: arek
  Date: 09.08.2019
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> list</h1>
<p>  <a href='<c:url value="/dwarf/add"/>'>Dodaj krasnala</a> </p>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Akcja</th>
    </tr>
    <c:forEach items="${dwarfs}" var="dwarf">
        <tr>
            <td>${dwarf.id}</td>
            <td>${dwarf.name}</td>
            <td>
                <a href='<c:url value="/dwarf/delete?id=${dwarf.id}"/>'>Usuń</a>
                <a href='<c:url value="/dwarf/edit?id=${dwarf.id}"/>'>Edit</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
