<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 21/07/18
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/Header.jsp"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/create.css" />
</head>
<body>
Rentre ta phrase :<br><br>
<div id="container">
<form action="${pageContext.request.contextPath}/create" method="post">
    <div id="sujetbloc">
        <label for="sujet">Sujet</label>
        <input type="text" id="sujet" name="sujet" required placeholder="je, tu ..."><br><br>
    </div>
    <div id="verbebloc">
        <label for="verbe"> Verbe</label>
        <input type="text" id="verbe" name="verbe" required placeholder="marcher, bouger ..."><br><br>
    </div>
    <div id="codbloc">
        <label for="cod"> Complement</label>
        <input type="text" id="cod" name="cod" required placeholder="des pates ..."><br><br>
        <input type="submit" value="Envoyer la phrase">
    </div>

</form>
</div>
</body>
</html>
