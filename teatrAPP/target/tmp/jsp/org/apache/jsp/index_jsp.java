package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Baza Teatru</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class = index>\r\n");
      out.write("<h1> Teatr </h1>\r\n");
      out.write("\r\n");
      out.write("     <div class=\"body-content\">\r\n");
      out.write("        <div class=\"row\">       \r\n");
      out.write("          <a class=\"btn btn-default\" href=\"getPrzedstawienieData.jsp\"><b><font color=\"red\">Dodaj przedstawienie</font></b></a><br><br>\r\n");
      out.write("\t\t\t   <a class=\"btn btn-default\" href=\"showAllPrzedstawienie.jsp\"><b><font color=\"red\">Zobacz wszystkie przedstawienia</font></b></a>\r\n");
      out.write("\t\t\t  <br><br>\r\n");
      out.write("\t\t\t\t <a class=\"btn btn-default\" href=\"getScenaData.jsp\"><b><font color=\"red\">Dodaj scene</font></b></a><br><br>\r\n");
      out.write("\t\t\t   <a class=\"btn btn-default\" href=\"showAllSceny.jsp\"><b><font color=\"red\">Zobacz wszystkie sceny</font></b></a>\r\n");
      out.write("<br><br>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>  \r\n");
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
