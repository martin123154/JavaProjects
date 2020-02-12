package main.java.com.mzelek.web;

import main.java.com.mzelek.domain.Scena;
import main.java.com.mzelek.service.ScenaManager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/updateScena")  
public class ScenaUpdate  extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");

        int ID = Integer.parseInt(request.getParameter("id"));
        String Nazwa = request.getParameter("nazwa");          
        String Wielkosc = request.getParameter("wielkosc");        
        int Numer = Integer.parseInt(request.getParameter("numer"));  
        
        ScenaManager sm = (ScenaManager) getServletContext().getAttribute("scenamanager");

        for (int i=0; i<sm.getAllScena().size(); i++)
        {
            if (sm.getAllScena().get(i).getScena_id() == ID)
            {
                Scena s = sm.getAllScena().get(i);
                s.setScena_id(ID);
                s.setNazwa(Nazwa);
                s.setWielkosc(Wielkosc);
                s.setNumer(Numer);
                break;
            }
        }

        this.getServletContext().getRequestDispatcher("/showAllSceny.jsp").forward(request, response);
    }
}
