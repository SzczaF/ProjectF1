<%--
  Created by IntelliJ IDEA.
  User: slawe
  Date: 05.05.2023
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="../menu.jsp"/>
<html>

<div class="news-details" style="max-width: 50%">
    <h1 style="font-weight: bolder">${news.title} </h1>
    <p style="font-weight: bold; font-style: italic">${news.description}</p>
    <p>${news.text}</p>
    <i style="font-size: 0.8rem">${news.dateTime} - ${news.user.userName}</i>
</div>

</body>
</html>
