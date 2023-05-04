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


Lista Torów<br><br>
<table border="1">
    <tr>
        <td>ID</td>
        <td>StringID</td>
        <td>Name</td>
        <td>Location</td>
        <td>Country</td>
        <td>URL</td>
    </tr>
    <c:forEach items="${circuits}" var="circuit">
        <tr>
            <td>${circuit.circuitId}</td>
            <td>${circuit.circuitRef}</td>
            <td>${circuit.name}</td>
            <td>${circuit.location}</td>
            <td>${circuit.country}</td>
            <td>${circuit.url}</td>
            <td>
                <a href="/circuit/form/edit/${circuit.circuitId}">
                    <button>Edytuj</button>
                </a>
            </td>
            <td>
                <a href="/circuit/form/confirm/${circuit.circuitId}">
                    <button style="color: darkred">Usuń</button>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
<br>

</body>
</html>
