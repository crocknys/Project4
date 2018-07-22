<%--
  Created by IntelliJ IDEA.
  User: Crock
  Date: 21/07/2018
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="${pageContext.request.contextPath}/Css/bigmenu.css" rel="stylesheet" type="text/css">

    <title>la taverne a idees de crocmou</title>
</head>

<body id = "body">

<div id="bloc1" onclick="location.href='${pageContext.request.contextPath}/generateur';">
    <p> Générer un idée</p>
</div>

<div id="bloc2" onclick="location.href='${pageContext.request.contextPath}/create';">
    <p> Proposer une idée</p>
</div>

<div id="bloc3" onclick="location.href='${pageContext.request.contextPath}/principale';">
    <p> Liste idée</p>
</div>

</body>

</html>
