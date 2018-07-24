<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 24/07/18
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <jsp:include page="/WEB-INF/Header.jsp"/>
</head>
<jsp:include page="/WEB-INF/navbar.jsp"/>
<body>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/generateur.css" />

<h3>Nouvelle idée  :</h3>

    <p>${sujet} ${verbe} ${complement}</p>

    <form method="post" action="/generateur">
        <button type="submit">RELOAD</button>
    </form>
</body>
</html>
