
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

    

<h3><c:out value="${ sessionScope.user.userName }" />Votre budget est de : <c:out value="${ play.lastBudget }" >1000</c:out> euros</h3>

<h4>Veuillez miser et choisir un nombre entre 0 et 5, si vous trouvez le bon nombre, vous doublez votre mise , sinon vous perdez votre mise </h4>
 <c:choose>

 <c:when test="${play.playAgain == false }">
 <div> <h2>${play.message}</h2>
       <p>le nombre à trouver était le ${play.nbMystere}</p>
         
        <p>Vous avez misé : ${play.miseUser }</p>
       <p>Votre budget restant: ${play.lastBudget }</p>
      
      <form>
       <input type="submit" value ="Rejouer" />
        </form>
      </div>
 </c:when>
 
 <c:otherwise>
 <form method="post" action="play">
            <label for="mise">mise : </label>
            <input type="text" name="mise" id="mise" />
            
            
             <label for="nbPlay">Choisissez un nombre : </label>
            <input type="text" name="nbPlay" id="nbPlay" />
            
             <input type="submit" value ="play" />
        </form>
 </c:otherwise>
 </c:choose>
 
        
        
        
    
    
       
  
</body>
</html>