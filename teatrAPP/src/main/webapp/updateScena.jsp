<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="main.java.com.mzelek.domain.Scena"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Edycja</title>
</head>
<style rel="stylesheet" type="text/css">
body {    background-color: #ffcc66; }
.adam { margin-top: 4cm; margin-left: 15cm; font-size: 24px;}
.baba { margin-left:3cm; margin-top:1cm;}
a { color:black; font-size:24px; font-weight:bold; margin-left: 15cm; margin-top: 2cm;}
            h1 	    {text-align: center; color: black; font-size: 70px; font-style: italic;
                    text-decoration:  ; font-family: "Arial"; margin-top: -12cm;}
</style>
<body>
	<jsp:useBean id="scena" class="main.java.com.mzelek.domain.Scena" scope="session" />
	<jsp:setProperty name="scena" property="*" />
	<jsp:useBean id="scenamanager" class="main.java.com.mzelek.service.ScenaManager"
		scope="application" />

     <%
        String ID = request.getParameter("update");
     int numer = 0;
    	String  nazwa = "",  wielkosc = "";
        for (Scena s : scenamanager.getAllScena())
        {
          if (s.getScena_id() == Integer.parseInt(ID))
          {
      	
        nazwa = s.getNazwa();
       	wielkosc = s.getWielkosc();
        numer = s.getNumer();
        break;
             }
         }
   out.println("<div class = 'adam'><form action='updateScena'><input type='hidden' name='id' value='" + ID +
		   "' /><tr><td colspan='2'><b>ID Scena</b>&nbsp; &nbsp; = &nbsp;  " + ID +
		   "</td></tr><br><tr><td><b>Nazwa: </b>  &nbsp;  &nbsp; &nbsp; </td><td><input type='text' name='nazwa' pattern='[A-Za-z]*' title='Nazwa ma sie składać tylko z liter' value='" + nazwa +
		   "' /></td></tr><br><tr><td><b>Wielkosc:</b>&nbsp; </td><td><input type='text' name='wielkosc' pattern='[A-Za-z]*' title='Wielkość ma sie składać tylko z liter' value='" + wielkosc +
		   "' /></td></tr><tr><br><td><b>Numer:</b>  &nbsp; &nbsp;     </td><td><input type='text' name='numer'  pattern='[0-9]*' title='Tylko liczby' value='" + numer + 
		   "' /></td></tr><tr><br><td colspan='2'><div class='baba'><input type='submit' value='ZAPISZ'></div></td></tr></form></div>");
                %>
<a class="btn btn-default" href="index.jsp"><b><font color="black">Powrót do strony głównej</a> 
<h1>Edycja</h1>
</body>
</html>