<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 18/07/18
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="fr">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/baseSecrete.css"/>
<head>
    <jsp:include page="/WEB-INF/Header.jsp"/>
</head>
<body>
<jsp:include page="/WEB-INF/navbar.jsp"/>

    <h2>Enpanne d'idée ?</h2></br>
    <h2>Essayez notre super générateur d'idées aléatoires  :</h2></br>
    <form method="post" action="/generateur">
    <button type="submit">Send</button>
        <div><img src="https://png.pngtree.com/element_origin_min_pic/17/07/23/f216b61acf24cc80935ecb8883896f94.jpg" /></div>
</form>
</body>
</html>
