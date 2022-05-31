package cl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import cl.negocios.Alumno;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */

@WebServlet(name = "muestraRegistro", urlPatterns =
{"/muestraRegistro"})
public class muestraRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public muestraRegistro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		 PrintWriter out = response.getWriter();
		 
		 
		 try {
			 String nombre= request.getParameter("nombre");
			 String apellidos= request.getParameter("apellidos");
			 Double promedio =
			 Double.parseDouble(request.getParameter("prom"));
			 
			 Alumno alumno = new Alumno(nombre,apellidos,promedio);
			 //TODO output your page here
			 out.println("<html>");
			 out.println("<head>");
			 out.println("<title>Servlet muestraRegistro</title>"); 
			 out.println("</head>");
			 out.println("<body>");
			 out.println("<h1>Servlet muestraRegistro at " +
			 request.getContextPath () + "</h1>");
			 out.println("<h2> Este es el Servlet muestraRegistro.java</h2>");
			 out.println("<h3> A continuación se muestran los parámetros recibidos </h3>");
			 out.println(alumno);
			 out.println("</body>");
			 out.println("</html>"); 
			 
			 } finally { 
			 out.close();
			 }
			 }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
