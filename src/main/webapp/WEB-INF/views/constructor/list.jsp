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


Lista Konstruktorów<br><br>
<table border="1">
    <tr>
        <td>ID</td>
        <td>StringRef</td>
        <td>Name</td>
        <td>Country</td>
        <td>URL</td>
    </tr>
    <c:forEach items="${constructors}" var="constructor">
        <tr>
            <td>${constructor.constructorId}</td>
            <td>${constructor.constructorRef}</td>
            <td>${constructor.name}</td>
            <td>${constructor.nationality}</td>
            <td>${constructor.url}</td>
            <td>
                <a href="/constructor/form/edit/${constructor.constructorId}">
                    <button>Edytuj</button>
                </a>
            </td>
            <td>
                <a href="/constructor/form/confirm/${constructor.constructorId}">
                    <button style="color: darkred">Usuń</button>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
<br>

</body>
</html>
