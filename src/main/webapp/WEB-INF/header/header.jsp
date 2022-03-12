
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
<h1>Casino Game </h1>

<c:choose>
<c:when test="${  sessionScope.user.connect == true}">
<h3>Bienvenue , <c:out value="${ sessionScope.user.userName }" /></h3>
<%@include file = "menu.jsp" %>
</c:when>
<c:otherwise>
<ul>
<li><a href="login">LOG IN</a></li>
</ul>
</c:otherwise>
</c:choose>
</header>
</body>
</html>