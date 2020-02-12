package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addAktor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Dodaj Aktora</title>\r\n");
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
      out.write("\t.link { color: black ; font-weight: bold; text-align: center;}\r\n");
      out.write("\t.header {\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    background-color: #C0C0C0; }\r\n");
      out.write("    p {  font-weight: bold; color: black;   margin-top: 80px;  margin-left: 500px; font-size: 24px;}\r\n");
      out.write(" \r\n");
      out.write(" </style>\r\n");
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
      out.write("\t\t\t");

		aktormanager.add(aktor);
	
      out.write("\r\n");
      out.write("\t<div class=\"dodaj\">\r\n");
      out.write("\t<p>Następująca osoba została dodana do bazy:</p>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr class = \"header\">\r\n");
      out.write("\t\t<td> Imię: </td>\r\n");
      out.write("\t\t<td> Nazwisko: </td>\r\n");
      out.write("\t\t<td> Pesel </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td> ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.mzelek.domain.Aktor)_jspx_page_context.findAttribute("aktor")).getImie())));
      out.write(" </td>\r\n");
      out.write("\t\t<td> ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.mzelek.domain.Aktor)_jspx_page_context.findAttribute("aktor")).getNazwisko())));
      out.write(" </td>\r\n");
      out.write("\t\t<td> ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.mzelek.domain.Aktor)_jspx_page_context.findAttribute("aktor")).getPesel())));
      out.write(" </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t <a class = \"link\" href=\"http://localhost:8080/teatr/\">Powrót do strony głównej</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\r\n");
      out.write("\t <a class = \"link\" href=\"getAktorData.jsp\">Dodaj kolejnego  aktora</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\r\n");
      out.write("    <a class = \"link\" href=\"showAllAktorzy.jsp\">Zobacz wszystkich aktorów w bazie</a>\r\n");
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
