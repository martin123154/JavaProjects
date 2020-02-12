<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Dodaj Przedstawienie</title>
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
	<jsp:useBean id="przedstawienie" class="main.java.com.mzelek.domain.Przedstawienie" scope="session" />
	<jsp:setProperty name="przedstawienie" property="*" />
	<jsp:useBean id="przedstawieniemanager" class="main.java.com.mzelek.service.PrzedstawienieManager"
		scope="application" />
			<%
		przedstawieniemanager.add(przedstawienie);
	%>
	<div class="dodaj">
	<p>Następujące przedstawienie zostało dodane do bazy:</p>
	

<table>
	<tr class = "header">
		<td> Tytuł </td>
		<td> Data rozpoczęcia </td>
		<td> Data zakończenia </td>
		<td> ID Scena </td>
	</tr>
	<tr>
		<td> <jsp:getProperty name="przedstawienie" property="tytul"></jsp:getProperty> </td>
		<td> <jsp:getProperty name="przedstawienie" property="data_rozp"></jsp:getProperty> </td>
		<td> <jsp:getProperty name="przedstawienie" property="data_zak"></jsp:getProperty> </td>
		<td> <jsp:getProperty name="przedstawienie" property="scena_id"></jsp:getProperty> </td>
	</tr>


</table>

	<br><br>
	 <a class="btn btn-default" href="http://localhost:8080/teatr/"><b><font color="red">Powrót do strony głównej</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
	
	 <a class="btn btn-default" href="getPrzedstawienieData.jsp"><b><font color="red">Dodaj kolejne przedstawienie</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;

    <a class="btn btn-default" href="showAllPrzedstawienie.jsp"><b><font color="red">Zobacz wszystkie przedstawienia w bazie</a>
  
	</div>
</body>
</html>