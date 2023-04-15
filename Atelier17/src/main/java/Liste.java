

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Liste
 */
@WebServlet("/Liste")
public class Liste extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Liste() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> table = new ArrayList<String>();
		table.add("Abidjan");
		table.add("Bouake");
		table.add("Dabou");
		table.add("Tabou");
		table.add("Man");
		table.add("Tiebissou");
		table.add("Yakro");
		ServletContext contexte = getServletContext();
		contexte.setAttribute("liste", table);
		
		String url = "afficheur.jsp";
		// String url = "/Mandataire";
		// RequestDispatcher rd = request.getRequestDispatcher(url);
		// rd.forward(request, response);
		
		response.sendRedirect(url);
		
		PrintWriter out = response.getWriter();	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
