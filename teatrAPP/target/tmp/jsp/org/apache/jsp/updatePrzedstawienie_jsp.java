package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.java.com.mzelek.domain.Przedstawienie;

public final class updatePrzedstawienie_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<title>Edycja</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("body {    background-color: #ffcc66; }\r\n");
      out.write(".adam { margin-top: 4cm; margin-left: 15cm; font-size: 24px;}\r\n");
      out.write(".baba { margin-left:3cm; margin-top:1cm;}\r\n");
      out.write("a { color:black; font-size:24px; font-weight:bold; margin-left: 15cm; margin-top: 2cm;}\r\n");
      out.write("            h1 \t    {text-align: center; color: black; font-size: 70px; font-style: italic;\r\n");
      out.write("                    text-decoration:  ; font-family: \"Arial\"; margin-top: -12cm;}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      main.java.com.mzelek.domain.Przedstawienie przedstawienie = null;
      synchronized (session) {
        przedstawienie = (main.java.com.mzelek.domain.Przedstawienie) _jspx_page_context.getAttribute("przedstawienie", PageContext.SESSION_SCOPE);
        if (przedstawienie == null){
          przedstawienie = new main.java.com.mzelek.domain.Przedstawienie();
          _jspx_page_context.setAttribute("przedstawienie", przedstawienie, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("przedstawienie"), request);
      out.write("\r\n");
      out.write("\t");
      main.java.com.mzelek.service.PrzedstawienieManager przedstawieniemanager = null;
      synchronized (application) {
        przedstawieniemanager = (main.java.com.mzelek.service.PrzedstawienieManager) _jspx_page_context.getAttribute("przedstawieniemanager", PageContext.APPLICATION_SCOPE);
        if (przedstawieniemanager == null){
          przedstawieniemanager = new main.java.com.mzelek.service.PrzedstawienieManager();
          _jspx_page_context.setAttribute("przedstawieniemanager", przedstawieniemanager, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("     ");

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
                
      out.write("\r\n");
      out.write("<a class=\"btn btn-default\" href=\"index.jsp\"><b><font color=\"black\">Powrót do strony głównej</a> \r\n");
      out.write("<h1>Edycja</h1>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
