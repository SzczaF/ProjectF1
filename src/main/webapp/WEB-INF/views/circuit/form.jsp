<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="../menu.jsp"/>


<form:form method="post" modelAttribute="circuit">
<%--    <form:errors path="*"/><br>--%>

    StringID: <form:input path="circuitRef"/><br>
    <form:errors path="circuitRef"/><br>

    Name: <form:textarea path="name"/><br>
    <form:errors path="name"/><br>

    Location: <form:textarea path="location"/><br>
    <form:errors path="location"/><br>

    Country: <form:textarea path="country"/><br>
    <form:errors path="country"/><br>

    URL: <form:input path="url"/><br>
    <form:errors path="url"/><br>

    <button type="submit">Zatwierdź</button>

</form:form>

</body>
</html>