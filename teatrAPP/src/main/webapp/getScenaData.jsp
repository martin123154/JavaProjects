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
 .contentbox {
    margin-top: 120px;
     margin-left: 550px;
    width: auto;
    height: 100%;
    background-color: #ffcc66;
    border-color: #A0A0A0;
    overflow: auto;
    font-family: Arial;   
    font-size: 24px; 
           }
    .tak {color:black;  font-weight: bold; }
	.sumbit { text-align: center;}
       .tak3 {color:black;  font-weight: bold; text-align: center;}
       .stronka { font-weight: bold;  margin-left: 600px; color: black}
        </style>

<body>

	<jsp:useBean id="scena" class="main.java.com.mzelek.domain.Scena" scope="session" />
	<jsp:setProperty name="scena" property="*" />
	<jsp:useBean id="scenamanager" class="main.java.com.mzelek.service.ScenaManager"
		scope="application" />
		
		<div class="contentbox">
            <form action="addScena.jsp">
            <table class="operationtable">
                <tr class='tableheader'>
                    <td class = tak3 colspan='2'>Dodaj Scene</td>
                </tr>
				 
                <tr>
                    <td class = tak> Nazwa:</td>
                    <td><input type="text" name="nazwa" pattern="[A-Za-z]*" title="Nazwa ma sie składać tylko z liter" value="" /></td>
                </tr>
                <tr>
                    <td class = tak>Wielkość:</td>
                    <td><input type="text" name="wielkosc" pattern="[A-Za-z]*" title="Wielkość ma sie składać tylko z liter" value="" /></td>
                </tr>
                <tr>
                    <td class = tak>Numer:</td>
                    <td ><input type="text" name="numer" pattern="[0-9]*" title="Tylko liczby" value="" /></td>
                </tr>
                <tr>
                    <td  class = sumbit colspan="2"><input type="submit" value=" DODAJ " align="right"></td>
                </tr>
            </table>
            </form>
        </div>

    <br><br>
    <center> <a  class="btn btn-default" href="http://localhost:8080/teatr/"><b><font color="black">Powrót do strony głównej</a></center>
    
</body>
</html>