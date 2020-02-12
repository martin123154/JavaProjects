<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="main.java.com.mzelek.domain.Przedstawienie"%>
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
	<jsp:useBean id="przedstawienie" class="main.java.com.mzelek.domain.Przedstawienie" scope="session" />
	<jsp:setProperty name="przedstawienie" property="*" />
	<jsp:useBean id="przedstawieniemanager" class="main.java.com.mzelek.service.PrzedstawienieManager"
		scope="application" />

     <%
        String ID = request.getParameter("update");
    	int scena_id = 0;
    	String  tytul = "", data_rozp = "", data_zak = ""; 
        for (Przedstawienie p : przedstawieniemanager.getAllPrzedstawienie())
        {
          if (p.getPrzedstawienie_id() == Integer.parseInt(ID))
          {
      	
        tytul = p.getTytul();
        data_rozp = p.getData_rozp();
        data_zak = p.getData_zak();
        scena_id = p.getScena_id();
 
        break;
             }
         }
   out.println("<div class = 'adam'><form action='updatePrzedstawienie'><input type='hidden' name='id' value='" + ID +
		   "' /><tr><td colspan='2'><b>ID Przedstawienia</b>&nbsp; &nbsp; = &nbsp;  " + ID +
		   "</td></tr><br><tr><td><b>Tytul </b>&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   &nbsp;  &nbsp; &nbsp; </td><td><input type='text' name='tytul' pattern=''[A-Za-z]*' title='Tytuł ma sie składać tylko z liter'  value='" + tytul +
		   "' /></td></tr><br><tr><td><b>Data rozpoczęcia:</b>&nbsp;&nbsp;  </td><td><input type='text' name='data_rozp' pattern='[0-3]{1}[0-9]{1}-[0-1]{1}[0-2]{1}-[1-2][0-9]{3} [0-2]{1}[0-9]{1}:[0-9]{2}' title='Format DD-MM-RRRR HH:MM' value='" + data_rozp +
		   "' /></td></tr><br><tr><td><b>Data zakończenia:</b>&nbsp; </td><td><input type='text' name='data_zak' pattern='[0-3]{1}[0-9]{1}-[0-1]{1}[0-2]{1}-[1-2][0-9]{3} [0-2]{1}[0-9]{1}:[0-9]{2}' title='Format DD-MM-RRRR HH:MM' value='" + data_zak +
		   "' /></td></tr><br><tr><td><b>ID Scena:</b>&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  </td><td><input type='text' name='scena_id' pattern='[0-9]*' title='Tylko liczby' value='" + scena_id +
		   "' /></td></tr><tr><br><td colspan='2'><div class='baba'><input type='submit' value='ZAPISZ'></div></td></tr></form></div>");
                %>
<a class="btn btn-default" href="index.jsp"><b><font color="black">Powrót do strony głównej</a> 
<h1>Edycja</h1>
</body>
</html>