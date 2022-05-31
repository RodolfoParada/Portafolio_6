package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Model.GestorBD;
import Model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(name = "muestraUsuarios",
 urlPatterns = {"/muestraUsuarios"})
public class muestraUsuarios extends HttpServlet {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void processRequest(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
 response.setContentType("text/html;charset=UTF-8");
 PrintWriter out = response.getWriter();
 try {
 ArrayList <Usuario> usuarios = new ArrayList<Usuario>();
// Usuario usuario;
 GestorBD gestorBD = new GestorBD();
 
 usuarios = gestorBD.leeTodos();
 if (usuarios != null){
 request.setAttribute("Usuarios",usuarios); 
 request.getRequestDispatcher("/listaUsuarios.jsp")
 .forward(request, response);
 }else
 request.getRequestDispatcher("/noHayRegistros.jsp")
 .forward(request, response); 
 } finally { 
 out.close();
 }
 }
}