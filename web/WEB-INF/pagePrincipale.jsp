<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 18/07/18
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!doctype html>
<html lang="fr">
<head>
    <jsp:include page="/WEB-INF/Header.jsp"/>
</head>
<jsp:include page="/WEB-INF/navbar.jsp"/>
<body>
<h1>Je suis le menu !</h1>

<div>
    <tbody>
    <c:forEach items="${requestScope.list}" var="kiwi">

        <tr>
            <td> ${kiwi.sujet} </td>
            <td> ${kiwi.verb} </td>
            <td> ${kiwi.cod} </td>
            </br>
        </tr>

    </c:forEach>
    </tbody>
</div>

</body>

</html>
