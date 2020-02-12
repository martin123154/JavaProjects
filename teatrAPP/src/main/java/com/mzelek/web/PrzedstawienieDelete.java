package main.java.com.mzelek.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.java.com.mzelek.service.PrzedstawienieManager;
import java.io.IOException;

@WebServlet(urlPatterns = "/deletePrzedstawienie")
public class PrzedstawienieDelete extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");

        int index = -1;
        
        int ID = Integer.parseInt(request.getParameter("delete"));

        PrzedstawienieManager pm = (PrzedstawienieManager) getServletContext().getAttribute("przedstawieniemanager");

        for (int i=0; i<pm.getAllPrzedstawienie().size(); i++)
        {
            if (pm.getAllPrzedstawienie().get(i).getPrzedstawienie_id() == ID)
            {
                index = i;
                break;
            }
        }
        
        if (index != -1)
            pm.getAllPrzedstawienie().remove(index);

        this.getServletContext().getRequestDispatcher("/showAllPrzedstawienie.jsp").forward(request, response);
    }

}