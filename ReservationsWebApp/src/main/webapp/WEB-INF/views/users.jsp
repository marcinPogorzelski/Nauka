<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista uzytkownikow</title>
</head>
<body>
	<ul>
		<c:forEach items="${userList}" var="user">
			<li id="user_<c:out value="user.id"/>">
				<c:out value="${user.name}"></c:out>
				<c:out value="${user.surname}"></c:out>
			</li>
		</c:forEach>
	</ul>
</body>
</html>