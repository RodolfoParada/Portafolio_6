package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import Model.GestorBD;
import Model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 response.setContentType("text/html;charset=UTF-8");
 PrintWriter out = response.getWriter();
 String cuenta = request.getParameter("cuenta");
 String clave= request.getParameter("clave");
 
 try {
 Usuario usuario;
 GestorBD gestorBD = new GestorBD();
 
 usuario = gestorBD.consultar(cuenta,clave);
 
 if(usuario != null){
 request.setAttribute("nombre",usuario.getNombre()); 
 request.getRequestDispatcher("/inicioSistema.jsp")
 .forward(request, response);
 
 }else
	 request.getRequestDispatcher("/noEncontrado.jsp")
	 .forward(request, response);
	 
	 } finally { 
	 out.close();
	 
	 }
 }
}