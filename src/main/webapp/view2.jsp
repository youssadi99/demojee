<%--
  Created by IntelliJ IDEA.
  User: ysaad
  Date: 24/10/2026
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.youssadi.demojee.model.Person" %>
<html>
<head>
    <title>View2</title>
</head>
<body>
<h1>Person Info</h1>
<%
    Person p = (Person)request.getAttribute("prs");
    String name = p.getName();
    int age = p.getAge();
%>
<h2>Name: *************<%=name%></h2>
<h2>Age: *************<%=age%></h2>


</body>
</html>
