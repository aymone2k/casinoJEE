
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn</title>
</head>
<body>
<%@include file="../header/header.jsp" %>
  <div>
  <h2>SE CONNECTER</h2>
 
<c:choose>
<c:when test="${  sessionScope.user.connect == true}">
<c:redirect url="/play"/>

 </c:when>
 
  <c:when test="${  sessionScope.user.connect == false}">
  <h3> ACCES REFUSE AUX MOINS DE 18 ANS!!!</h3>
  <h4> <c:out value="${ sessionScope.user.userName }" />, tu as <c:out value="${ sessionScope.user.userAge }" /> tu es trop jeune pour jouer!!</h4>
   <div>
        <form method="post" action="login">
            <label for="name">Nom : </label>
            <input type="text" name="name" id="name" />
            <label for="age">Age : </label>
            <input type="text" name="age" id="age" />
            <input type="submit" value = "Log in"/>
        </form>
</div>
  </c:when>
  <c:otherwise> 
   
  <div>
        <form method="post" action="login">
            <label for="name">Nom : </label>
            <input type="text" name="name" id="name" />
            <label for="age">Age : </label>
            <input type="text" name="age" id="age" />
            <input type="submit" value = "Log in"/>
        </form>
</div>
  </c:otherwise>
  
  </c:choose>
  </div>
</body>
</html>