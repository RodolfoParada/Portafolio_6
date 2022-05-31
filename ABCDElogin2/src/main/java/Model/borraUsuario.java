package Model;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(name = "borraUsuario",
 urlPatterns = {"/borraUsuario"})
public class borraUsuario extends HttpServlet {
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
 String cuenta = request.getParameter("cuenta");
 String clave= request.getParameter("clave");
 
 GestorBD gestorBD = new GestorBD();
 
 if (gestorBD.borrar(cuenta, clave)){ 
 request.getRequestDispatcher("/registroBorrado.jsp")
 .forward(request, response); 
 }else
 request.getRequestDispatcher("/noBorroRegistro.jsp")
 .forward(request, response); 
 } finally { 
 out.close();
 }
 }
}