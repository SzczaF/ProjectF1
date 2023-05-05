<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="../menu.jsp"/>


<form:form method="post" modelAttribute="constructorResult">
<%--    <form:errors path="*"/><br>--%>

    Wyścig <form:select path="races">
        <form:option value="0" label="-- wybierz --"/>
        <form:options items="${raceList}" itemLabel="NameAndYear" itemValue="raceId"/>
    </form:select><br>
    <form:errors path="race"/><br>


    Konstruktor  <form:select path="constructors">
    <form:option value="0" label="-- wybierz --"/>
    <form:options items="${constructorList}" itemLabel="name" itemValue="constructorId"/>
    </form:select><br>
    <form:errors path="race"/><br>

    Punkty: <form:input path="points" type="number"/><br>
    <form:errors path="points"/><br>

    Status: <form:input path="status"/><br>
    <form:errors path="status"/><br>

    <button type="submit">Zatwierdź</button>

</form:form>

</body>
</html>