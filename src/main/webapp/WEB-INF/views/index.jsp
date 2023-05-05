<%--
  Created by IntelliJ IDEA.
  User: slawe
  Date: 02.05.2023
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:include page="menu.jsp"/>

<%--<h1><spring:message code="app.title"/></h1>--%>
<%--<h3><spring:message code="hello.message" arguments="${person.firstName}"/></h3>--%>


<c:forEach items="${newsList}" var="news">
    <div style="max-width: 50%">
        <a href="news-details/${news.id}" style="text-decoration: none; color: inherit">
            <h2>${news.title}</h2>
            <p>${news.description}</p>
            <i style="font-size: 0.8rem">${news.dateTime} - ${news.user.userName}</i>
        </a>
        <hr style="border: 1px solid lightgray">
    </div>

    <%--    <br>--%>

</c:forEach>


</body>
</html>
