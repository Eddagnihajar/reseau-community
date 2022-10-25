package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/choix_role")
public class choix_role extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public choix_role() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String role = request.getParameter("role");

		if(role.equals("Etudiant")) {
			response.sendRedirect("http://localhost:8080/Application_web/inscri_etudiant");
		} else if(role.equals("Professeur")) {
			response.sendRedirect("http://localhost:8080/Application_web/inscription_prof");
		}else {
			response.sendRedirect("http://localhost:8080/Application_web/inscription_entreprise");
		}
		
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
