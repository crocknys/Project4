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



<form action="${pageContext.request.contextPath}/create" method="post">
    <div id="presentation" class="col-9 mx-auto" >
        Rentre ta phrase :<br><br>
    </div>
    <div id="container" class="col-9 mx-auto">
        <div id="sujetbloc" class="col-4" >
            <label for="sujet">Sujet</label><br>
            <input type="text" id="sujet" name="sujet" required placeholder="je, tu ..."><br><br>
        </div>
        <div id="verbebloc" class="col-4">
            <label for="verbe"> Verbe</label><br>
            <input type="text" id="verbe" name="verbe" required placeholder="marcher, bouger ..."><br><br>
        </div>
        <div id="codbloc" class="col-4">
            <label for="cod"> Complement</label><br>
            <input type="text" id="cod" name="cod" required placeholder="des pates ..."><br><br>
        </div>
    </div>
    <br><br>
    <input type="submit" value="Envoyer la phrase" class="col-4 mx-auto">
</form>

</body>
</html>
