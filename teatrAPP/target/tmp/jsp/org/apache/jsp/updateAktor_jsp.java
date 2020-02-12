package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.java.com.mzelek.domain.Aktor;

public final class updateAktor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Edycja</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("body {    background-color: #ffcc66; }\r\n");
      out.write(".adam { margin-top: 4cm; margin-left: 15cm; font-size: 24px;}\r\n");
      out.write(".baba { margin-left:3cm; margin-top:1cm;}\r\n");
      out.write("a { color:black; font-size:24px; font-weight:bold; margin-left: 15cm; margin-top: 10cm;}\r\n");
      out.write("            h1 \t    {text-align: center; color: black; font-size: 70px; font-style: italic;\r\n");
      out.write("                    text-decoration:  ; font-family: \"Arial\"; margin-top: -9cm;}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      main.java.com.mzelek.domain.Aktor aktor = null;
      synchronized (session) {
        aktor = (main.java.com.mzelek.domain.Aktor) _jspx_page_context.getAttribute("aktor", PageContext.SESSION_SCOPE);
        if (aktor == null){
          aktor = new main.java.com.mzelek.domain.Aktor();
          _jspx_page_context.setAttribute("aktor", aktor, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("aktor"), request);
      out.write("\r\n");
      out.write("\t");
      main.java.com.mzelek.service.AktorManager aktormanager = null;
      synchronized (application) {
        aktormanager = (main.java.com.mzelek.service.AktorManager) _jspx_page_context.getAttribute("aktormanager", PageContext.APPLICATION_SCOPE);
        if (aktormanager == null){
          aktormanager = new main.java.com.mzelek.service.AktorManager();
          _jspx_page_context.setAttribute("aktormanager", aktormanager, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("     ");

        String ID = request.getParameter("update");
    	String  imie = "",  nazwisko = "", pesel = "";
        for (Aktor a : aktormanager.getAllAktor())
        {
          if (a.getAktor_id() == Integer.parseInt(ID))
          {
      	
        imie = a.getImie();
       	nazwisko = a.getNazwisko();
        pesel = a.getPesel();
        break;
             }
         }
   out.println("<div class = 'adam'><form action='updateAktor'><input type='hidden' name='id' value='" + ID +
		   "' /><tr><td colspan='2'><b>ID Aktora</b>&nbsp; &nbsp; = &nbsp;  " + ID +
		   "</td></tr><br><tr><td><b>Imię: </b>&nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp; </td><td><input type='text' name='imie' value='" + imie +
		   "' /></td></tr><br><tr><td><b>Nazwisko:</b>&nbsp; </td><td><input type='text' name='nazwisko' value='" + nazwisko +
		   "' /></td></tr><tr><br><td><b>Pesel:</b>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;     </td><td><input type='text' name='pesel' value='" + pesel + 
		   "' /></td></tr><tr><br><td colspan='2'><div class='baba'><input type='submit' value='ZAPISZ'></div></td></tr></form></div>");
                
      out.write("\r\n");
      out.write("<a href=\"index.jsp\">Powrót do strony głównej</a> \r\n");
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
