
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="../header/header.jsp" %>
<h2>JOUER</h2>
<p> out <c:out value="play"/></p>

<h3>Votre budget est de : <c:out value = "${play.lastBudget}">1000</c:out> euros</h3>
<h3>Ma mise</h3>

 <form method="post" action="play">
            <label for="mise">mise : </label>
            <input type="text" name="mise" id="mise" />
            
             <label for="nbPlay">Choisissez un nombre : </label>
            <input type="text" name="nbPlay" id="nbPlay" />
            
            
             <input type="submit" value ="play" />
        </form>
        
        <h3>Mon budget: ${play.budget}</h3>
        <p>mise : ${play.miseUser }</p>
       <p>budget restant: ${play.lastBudget }</p>
       <p>tentative restant: ${play.nbTry }</p>
        <p>mystere : ${play.nbMystere}</p>
</body>
</html>