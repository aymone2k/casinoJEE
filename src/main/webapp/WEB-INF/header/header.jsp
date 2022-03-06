
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>header</p>

<h3>Mon budget: ${budget}</h3>
<ul>
<li><a href="login">LOG IN</a></li>
</ul>

<%@include file = "menu.jsp" %>


<p>${user.login}</p>
<p>${user.name}</p>
<p>${user.age}</p>
<h4>${sessionScope.name }</h4>   
<h3>${name}, ${age }, ${login}</h3>
</body>
</html>