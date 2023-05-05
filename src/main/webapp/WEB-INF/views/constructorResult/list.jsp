<%--
  Created by IntelliJ IDEA.
  User: slawe
  Date: 02.05.2023
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<jsp:include page="../menu.jsp"/>


Wyniki konstruktorów<br><br>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Constructor</td>
        <td>Points</td>
        <td>Status</td>
    </tr>
    <c:forEach items="${constructorResults}" var="constrResults">
        <tr>
            <td>${constrResults.id}</td>
            <td>${constrResults.races.nameAndYear}</td>
            <td>${constrResults.constructors.name}</td>
            <td>${constrResults.points}</td>
            <td>${constrResults.status}</td>
            <td>
                <a href="/constrResults/form/edit/${constrResults.id}">
                    <button>Edytuj</button>
                </a>
            </td>
            <td>
                <a href="/constrResults/form/confirm/${constrResults.id}">
                    <button style="color: darkred">Usuń</button>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
<br>

</body>
</html>
