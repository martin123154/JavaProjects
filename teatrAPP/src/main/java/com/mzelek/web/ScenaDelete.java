package main.java.com.mzelek.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.java.com.mzelek.service.ScenaManager;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/deleteScena")
public class ScenaDelete extends HttpServlet{

	
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");

        int index = -1;
        
        int ID = Integer.parseInt(request.getParameter("delete"));

        ScenaManager sm = (ScenaManager) getServletContext().getAttribute("scenamanager");

        for (int i=0; i<sm.getAllScena().size(); i++)
        {
            if (sm.getAllScena().get(i).getScena_id() == ID)
            {
                index = i;
                break;
            }
        }
      
        if (index != -1)
            sm.getAllScena().remove(index);

    
        
      

        this.getServletContext().getRequestDispatcher("/showAllSceny.jsp").forward(request, response);
    }
}
