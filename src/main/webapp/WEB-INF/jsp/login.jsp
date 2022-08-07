<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login </title>

</head>
<body>
<h1>Login</h1>

<form th:action="@{/sign-in}" method="GET" th:object="${user}">
    <label for="username">Username</label>
    <input id="username" th:field="*{username}" />

    <label for="email">Email</label>
    <input id="email" th:field="*{email}" />

    <label for="password">Password</label>
    <input id="password" type="password" th:field="*{password}" />

    <input value="Log In" type="submit" />
</form>

<h3> Once logged in gain access to a wealth of resources</h3>

<form:button id="btn" value="btn"><small>Register</small></form:button>
</body>
</html>
