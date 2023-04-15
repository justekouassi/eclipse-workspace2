

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bienvenue
 */
@WebServlet("/aller.do")
public class Bienvenue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bienvenue() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> ensNom = request.getParameterNames();
		while (ensNom.hasMoreElements()) {
			String nom = (String) ensNom.nextElement();
			String valeurs[] = request.getParameterValues(nom);
			if (valeurs != null) {
				PrintWriter sortie = response.getWriter();
				for (int i = 0; i < valeurs.length; i++) {
					sortie.println("<p>" + nom + " : " + valeurs[i] + "</p>");
				}
			}
		}
		doGet(request, response);
	}

}
