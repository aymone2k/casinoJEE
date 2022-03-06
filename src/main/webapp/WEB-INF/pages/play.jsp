
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="../header/header.jsp" %>
<h2>PLAY</h2>

<h3>Votre budget est de : ${budget}</h3>
<h3>Ma mise</h3>

 <form method="post" action="play">
            <label for="mise">mise : </label>
            <input type="number" name="mise" id="mise" />
            
             <label for="nbPlay">Choisissez un nombre : </label>
            <input type="number" name="nbPlay" id="nbPlay" />
            
            
             <input type="submit" />
        </form>
        
        
       <p>mise restante: ${last budget }</p>
</body>
</html>