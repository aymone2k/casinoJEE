
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>


<ul>
<li><a href="login">LOG IN</a></li>
</ul>

<%@include file = "menu.jsp" %>

<h4>${user.userName}</h4>
<h4>${user.userAge}</h4>
<h4>${user.connect}</h4>
<h3>${ sessionScope.user.userName }</h3>

</header>
</body>
</html>