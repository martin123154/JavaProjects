package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.java.com.mzelek.domain.Aktor;

public final class showAllAktorzy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Baza Aktorów</title>\r\n");
      out.write("</head>\r\n");
      out.write(" <style rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write(" body {    background-color: #ffcc66; }\r\n");
      out.write(" a { color: red ; font-weight: bold; text-align: center;}\r\n");
      out.write("\r\n");
      out.write("            p{margin-left: 12cm; }\r\n");
      out.write("            .zmiana {margin-left : 25cm;}\r\n");
      out.write("\r\n");
      out.write(" </style>\r\n");
      out.write("<body>\r\n");
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
      out.write("<div>\r\n");
      out.write(" ");


 	int i=1;
	for (Aktor aktor : aktormanager.getAllAktor()) {
		out.println(			
	"<p><b>" 
	+ i +".</b><b>id aktora:</b>"
	+ aktor.getAktor_id() + 
	" <b>Imię:</b> " + aktor.getImie() + 
	" <b>Nazwisko:</b> " + aktor.getNazwisko() + 
	" <b> Pesel:</b> " + aktor.getPesel()  +" </p>");
		i++;
	}
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("     <div class='zmiana'><form action=\"deleteAktor\">\r\n");
      out.write("      <input type='text' name='delete' placeholder=\"Podaj ID\"/>  \r\n");
      out.write("      <input type='submit' value=\"USUŃ\" />\r\n");
      out.write("    </form>\r\n");
      out.write("      <form action=\"updateAktor.jsp\">\r\n");
      out.write("      <input type='text' name='update' placeholder=\"Podaj ID\"/>\r\n");
      out.write("      <input type='submit' value=\"EDYTUJ\" />\r\n");
      out.write("    </form></div>\r\n");
      out.write("  <a href=\"getAktorData.jsp\">Dodaj aktora</a></h2> &nbsp; &nbsp; &nbsp; &nbsp; <br><br><br>\r\n");
      out.write("    <a href=\"index.jsp\">Powrót do strony głównej</a></h2>\r\n");
      out.write("   \r\n");
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
