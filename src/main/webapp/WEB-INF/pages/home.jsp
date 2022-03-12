
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="../header/header.jsp" %>
<h2>Bienvenue</h2>
<h3>Régles du jeu</h3>
<p> out <c:out value="home"/></p>


<c:if test="${ 50 > 10 }" >
    C'est vrai !
</c:if>
</body>
</html>