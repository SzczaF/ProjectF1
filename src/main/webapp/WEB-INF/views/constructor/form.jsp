<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="../menu.jsp"/>


<form:form method="post" modelAttribute="constructor">
<%--    <form:errors path="*"/><br>--%>

    StringID: <form:input path="constructorRef"/><br>
    <form:errors path="constructorRef"/><br>

    Name: <form:input path="name"/><br>
    <form:errors path="name"/><br>

    Nationality: <form:input path="nationality"/><br>
    <form:errors path="nationality"/><br>

    URL: <form:input path="url"/><br>
    <form:errors path="url"/><br>

    <button type="submit">Zatwierdź</button>

</form:form>

</body>
</html>