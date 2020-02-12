package main.java.com.mzelek.web;
import main.java.com.mzelek.domain.Przedstawienie;
import main.java.com.mzelek.service.PrzedstawienieManager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/updatePrzedstawienie")  

public class PrzedstawienieUpdate  extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");

        int ID = Integer.parseInt(request.getParameter("id"));
        String Tytul = request.getParameter("tytul");          
        String Data_rozp = request.getParameter("data_rozp");
        String Data_zak = request.getParameter("data_zak");   
        int Scena_id = Integer.parseInt(request.getParameter("scena_id"));
        
        PrzedstawienieManager pm = (PrzedstawienieManager) getServletContext().getAttribute("przedstawieniemanager");

        for (int i=0; i<pm.getAllPrzedstawienie().size(); i++)
        {
            if (pm.getAllPrzedstawienie().get(i).getPrzedstawienie_id() == ID)
            {
                Przedstawienie p = pm.getAllPrzedstawienie().get(i);
                p.setPrzedstawienie_id(ID);
                p.setTytul(Tytul);
                p.setData_rozp(Data_rozp);
                p.setData_zak(Data_zak);
                p.setScena_id(Scena_id);
                break;
            }
        }

        this.getServletContext().getRequestDispatcher("/showAllPrzedstawienie.jsp").forward(request, response);
    }
}
