<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 21/07/18
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/Header.jsp"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}connexion.css" />
</head>
<body >
<div id = "connexion">
<form action="${pageContext.request.contextPath}/connexion" method="post">
    Si tu souhaites entrer, tu dois être en possession du mot de passe.<br><br>
    Attention, si tu te trompes ...
    <br><br>
    <label for="password">Entre le mot de passe </label>
    <input type="password" id="password"  name="password" required placeholder=" ***********"><br><br>
    <input type="submit" value ="Entrer dans la taverne">
    <br><br>
</form>
</div>
</body>
</html>
