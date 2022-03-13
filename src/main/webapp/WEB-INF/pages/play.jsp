
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Play</title>
</head>
<body>
<%@include file="../header/header.jsp" %>

<h2>JOUER</h2>

<p> out <c:out value="play"/></p>

<h3><c:out value="${ sessionScope.user.userName }" />Votre budget est de : <c:out value="${ sessionScope.user.topBudget }" /> euros</h3>
<h3>Vous disposez de <c:out value="${ sessionScope.user.nbTry }" /> tentatives</h3>
<h4>Veuillez miser et choisir un nombre entre 0 et 10, si vous trouvez le bon nombre, vous doublez votre mise , sinon vous perdez votre mise </h4>
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