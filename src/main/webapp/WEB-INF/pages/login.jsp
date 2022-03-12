
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="../header/header.jsp" %>
  
        <form method="post" action="login">
            <label for="name">Nom : </label>
            <input type="text" name="name" id="name" />
            <label for="age">Age : </label>
            <input type="text" name="age" id="age" />
            <input type="submit" value = "Log in"/>
        </form>

<p> out <c:out value="login"/></p>

</body>
</html>