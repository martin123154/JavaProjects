<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="main.java.com.mzelek.domain.Przedstawienie"%>
        <%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Baza Przedstawienia</title>

</head>
 <style rel="stylesheet" type="text/css">
 body {    background-color: #ffcc66; }
 a { color: red ; font-weight: bold; text-align: center;}
            p{margin-left: 10cm; }

 </style>
<body>
	<jsp:useBean id="przedstawieniemanager" class="main.java.com.mzelek.service.PrzedstawienieManager"
		scope="application" />

<div class="row">

<table style="width:80% " border="1";>
    <tr>
    	<th>ID Przedstawienie</th>
        <th>Tytuł</th>
        <th>Data rozpoczęcia</th>
        <th>Data zakończenia</th>
        <th>ID Sceny </th>
        <th>Obsługa</th>
    </tr>
 
	 <p:forEach var="przedstawienie" items="${przedstawieniemanager.getAllPrzedstawienie()}" varStatus="no">

	    <tr>
	     <td> ${przedstawienie.przedstawienie_id} </td>
            <td> ${przedstawienie.tytul} </td>
            <td> ${przedstawienie.data_rozp} </td>
             <td> ${przedstawienie.data_zak} </td>
             <td> ${przedstawienie.scena_id} </td>
             <td><form action="deletePrzedstawienie">
      <input type='hidden' name='delete' value= ${przedstawienie.przedstawienie_id} />  
      <input type='submit' value="USUŃ" />
    </form>
          <form action="updatePrzedstawienie.jsp">
      <input type='hidden' name='update'  value= ${przedstawienie.przedstawienie_id} />
      <input type='submit' value="EDYTUJ" />
    </form></td>
        </tr>
        </p:forEach>
            
            </div>
   
  <a class="btn btn-default" href="getPrzedstawienieData.jsp"><b><font color="red">Dodaj przedstawienie</a></h2> &nbsp; &nbsp; &nbsp; &nbsp; <br><br><br>
    <a class="btn btn-default" href="index.jsp"><b><font color="red">Powrót do strony głównej</a></h2> <br><br>
   
</body>
</html>