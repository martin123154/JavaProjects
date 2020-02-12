<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Dodaj Scene</title>
</head>
 <style rel="stylesheet" type="text/css">
	body {    background-color: #ffcc66; }
	table {
	border-collapse: collapse;
	width: 200px; 
	    margin-top: 120px;
     margin-left: 550px;}
	td {
	border: 2px solid #000000;
	padding: 5px;}

	.header {
    font-weight: bold;
    background-color: #C0C0C0; }
    p {  font-weight: bold; color: black;   margin-top: 80px;  margin-left: 500px; font-size: 24px;}
 
 </style>
<body>
	<jsp:useBean id="scena" class="main.java.com.mzelek.domain.Scena" scope="session" />
	<jsp:setProperty name="scena" property="*" />
	<jsp:useBean id="scenamanager" class="main.java.com.mzelek.service.ScenaManager"
		scope="application" />
			<%
		scenamanager.add(scena);
	%>
	<div class="dodaj">
	<p>Następująca scena została dodana do bazy:</p>
	

<table>
	<tr class = "header">
		<td> Nazwa: </td>
		<td> Wielkość: </td>
		<td> Numer </td>
	</tr>
	<tr>
		<td> <jsp:getProperty name="scena" property="nazwa"></jsp:getProperty> </td>
		<td> <jsp:getProperty name="scena" property="wielkosc"></jsp:getProperty> </td>
		<td> <jsp:getProperty name="scena" property="numer"></jsp:getProperty> </td>
	</tr>


</table>

	
<br><br>
	 <a class="btn btn-default" href="http://localhost:8080/teatr/"><b><font color="red">Powrót do strony głównej</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
	
	 <a class="btn btn-default" href="getScenaData.jsp"><b><font color="red">Dodaj kolejną scene</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;

    <a class="btn btn-default" href="showAllSceny.jsp"><b><font color="red">Zobacz wszystkie sceny w bazie</a>
  
	</div>
</body>
</html>