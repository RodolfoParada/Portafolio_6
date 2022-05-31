 package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import negocios.GuardarProducto;
import negocios.Producto;

/**
 * Servlet implementation class RegistrarProducto
 */
@WebServlet(name = "RegistraProducto",urlPatterns = {"/RegistraProducto"})
public class RegistrarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarProducto() {
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
		 int clave=
		 Integer.parseInt(request.getParameter("clave"));
		 String nombre= request.getParameter("nombre");
		 Double precio=
		 Double.parseDouble(request.getParameter("precio"));
		 int cantidad=
		 Integer.parseInt(request.getParameter("cant"));
		 
		 Producto producto =
				 new Producto(clave, nombre, precio, cantidad);
				 
				 ServletContext sc = this.getServletContext();
				 String path = sc.getRealPath("/WEB-INF/Productos.txt");
				 path = path.replace('\\','/');
				 
				 // Guardar en archivo
				 GuardarProducto.add(producto, path); 
				 request.setAttribute("atribProd",producto);
				 request.getRequestDispatcher("/MuestraRegistro.jsp")
				 .forward(request, response);
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
