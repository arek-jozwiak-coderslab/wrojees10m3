<%--
  Created by IntelliJ IDEA.
  User: arek
  Date: 09.08.2019
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edytuj krasnala: ${dwarf.name}</h1>
<form method="post">
    <input type="hidden" name="id" value="${dwarf.id}"/>
    <input type="text" name="name" value="${dwarf.name}"/>
    <input type="submit"/>
</form>
</body>
</html>
