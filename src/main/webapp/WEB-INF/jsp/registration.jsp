
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Registration</h1>
<%--Binds to Registration Controller LINE 17--%>
<%--<form:form modelAttribute="registration">
    <table>

        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>
    &lt;%&ndash;&ndash;%&gt;
        <tr>
            <td colspan="2">
                <input type="submit" value="Add Registration">
            </td>
        </tr>

    </table>
</form:form>--%>

<form th:action="@{/sign-up}" method="POST" th:object="${user}">
    <label for="username">Username</label>
    <input id="username" th:field="*{username}" />

    <label for="email">Email</label>
    <input id="email" th:field="*{email}" />

    <label for="password">Password</label>
    <input id="password" type="password" th:field="*{password}" />

    <input value="Sign me up!" type="submit" />
</form>
</body>
</html>
