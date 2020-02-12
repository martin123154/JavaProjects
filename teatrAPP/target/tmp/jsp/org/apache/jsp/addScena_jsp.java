package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addScena_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Dodaj Scene</title>\r\n");
      out.write("</head>\r\n");
      out.write(" <style rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\tbody {    background-color: #ffcc66; }\r\n");
      out.write("\ttable {\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("\twidth: 200px; \r\n");
      out.write("\t    margin-top: 120px;\r\n");
      out.write("     margin-left: 550px;}\r\n");
      out.write("\ttd {\r\n");
      out.write("\tborder: 2px solid #000000;\r\n");
      out.write("\tpadding: 5px;}\r\n");
      out.write("\r\n");
      out.write("\t.header {\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    background-color: #C0C0C0; }\r\n");
      out.write("    p {  font-weight: bold; color: black;   margin-top: 80px;  margin-left: 500px; font-size: 24px;}\r\n");
      out.write(" \r\n");
      out.write(" </style>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      main.java.com.mzelek.domain.Scena scena = null;
      synchronized (session) {
        scena = (main.java.com.mzelek.domain.Scena) _jspx_page_context.getAttribute("scena", PageContext.SESSION_SCOPE);
        if (scena == null){
          scena = new main.java.com.mzelek.domain.Scena();
          _jspx_page_context.setAttribute("scena", scena, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("scena"), request);
      out.write("\r\n");
      out.write("\t");
      main.java.com.mzelek.service.ScenaManager scenamanager = null;
      synchronized (application) {
        scenamanager = (main.java.com.mzelek.service.ScenaManager) _jspx_page_context.getAttribute("scenamanager", PageContext.APPLICATION_SCOPE);
        if (scenamanager == null){
          scenamanager = new main.java.com.mzelek.service.ScenaManager();
          _jspx_page_context.setAttribute("scenamanager", scenamanager, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t\t\t");

		scenamanager.add(scena);
	
      out.write("\r\n");
      out.write("\t<div class=\"dodaj\">\r\n");
      out.write("\t<p>Następująca scena została dodana do bazy:</p>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr class = \"header\">\r\n");
      out.write("\t\t<td> Nazwa: </td>\r\n");
      out.write("\t\t<td> Wielkość: </td>\r\n");
      out.write("\t\t<td> Numer </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td> ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.mzelek.domain.Scena)_jspx_page_context.findAttribute("scena")).getNazwa())));
      out.write(" </td>\r\n");
      out.write("\t\t<td> ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.mzelek.domain.Scena)_jspx_page_context.findAttribute("scena")).getWielkosc())));
      out.write(" </td>\r\n");
      out.write("\t\t<td> ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.mzelek.domain.Scena)_jspx_page_context.findAttribute("scena")).getNumer())));
      out.write(" </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<br><br>\r\n");
      out.write("\t <a class=\"btn btn-default\" href=\"http://localhost:8080/teatr/\"><b><font color=\"red\">Powrót do strony głównej</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\r\n");
      out.write("\t <a class=\"btn btn-default\" href=\"getScenaData.jsp\"><b><font color=\"red\">Dodaj kolejną scene</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\r\n");
      out.write("    <a class=\"btn btn-default\" href=\"showAllSceny.jsp\"><b><font color=\"red\">Zobacz wszystkie sceny w bazie</a>\r\n");
      out.write("  \r\n");
      out.write("\t</div>\r\n");
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
