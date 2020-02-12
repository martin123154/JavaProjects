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

	<jsp:useBean id="przedstawienie" class="main.java.com.mzelek.domain.Przedstawienie" scope="session" />
	<jsp:setProperty name="przedstawienie" property="*" />
	<jsp:useBean id="przedstawieniemanager" class="main.java.com.mzelek.service.PrzedstawienieManager"
		scope="application" />
		
		<div class="contentbox">
            <form action="addPrzedstawienie.jsp">
            <table class="operationtable">
                <tr class='tableheader'>
                    <td class = tak3 colspan='2'>Dodaj Przedstawienie</td>
                </tr>
				 
                <tr>
                    <td class = tak>Tytuł:</td>
                    <td><input type="text" name="tytul" pattern="[A-Za-z]*" title="Tytuł ma sie składać tylko z liter" value="" /></td>
                </tr>
                <tr>
                    <td class = tak>Data rozpoczęcia:</td>
                    <td><input type="text" name="data_rozp" pattern="[0-3]{1}[0-9]{1}-[0-1]{1}[0-2]{1}-[1-2][0-9]{3} [0-2]{1}[0-9]{1}:[0-9]{2}" title="Format DD-MM-RRRR HH:MM" value="" /></td>
                </tr>
                 <tr>
                    <td class = tak>Data zakończenia:</td>
                    <td><input type="text" name="data_zak" pattern="[0-3]{1}[0-9]{1}-[0-1]{1}[0-2]{1}-[1-2][0-9]{3} [0-2]{1}[0-9]{1}:[0-9]{2}" title="Format DD-MM-RRRR HH:MM" value="" /></td>
                </tr>
                   <tr>
                    <td class = tak>ID Scena:</td>
                    <td><input type="text" name="scena_id" pattern="[0-9]*" title="Tylko liczby" value=""></td>
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