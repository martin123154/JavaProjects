<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="main.java.com.mzelek.domain.Scena"%>
    <%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Baza Scen</title>
</head>
 <style rel="stylesheet" type="text/css">
 body {    background-color: #ffcc66; }
 a { color: red ; font-weight: bold; text-align: center;}
 td {text-align : center;}
            p{margin-left: 12cm; }
           

            }
       
            
 </style>
<body>
	<jsp:useBean id="scenamanager" class="main.java.com.mzelek.service.ScenaManager"
		scope="application" />
<div class="row">

<table style="width:80% " border="1";>
    <tr>
    	<th>ID Scena</th>
        <th>Nazwa</th>
        <th>Wielkosc</th>
        <th>Numer</th>
        <th>Obsługa</th>
       
    </tr>



 <p:forEach var="scena" items="${scenamanager.getAllScena()}" varStatus="no">

	    <tr>
	     <td> ${scena.scena_id} </td>
            <td> ${scena.nazwa} </td>
            <td> ${scena.wielkosc} </td>
             <td> ${scena.numer}   </td>
             <td>  <form action="deleteScena">
      <input type='hidden' name='delete'   value= ${scena.scena_id} />  
      <input type='submit' value="USUŃ" />   </form> <form action="updateScena.jsp">
      <input type='hidden' name='update'  value= ${scena.scena_id} />
      <input type='submit' value="EDYTUJ" />
       </form>
      </td>
               
        </tr>

       </p:forEach>
  </div>
  <a class="btn btn-default" href="getScenaData.jsp" ><b><font color="red">Dodaj scene</a></h2> &nbsp; &nbsp; &nbsp; &nbsp; <br><br>
    <a class="btn btn-default" href="index.jsp"><b><font color="red">Powrót do strony głównej</a><br><br>
 
</body>
</html>