package compras.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import compras.modelo.Proveedor;

/**
 * Servlet implementation class cProveedor
 */
@WebServlet("/cProveedor")
public class cProveedor extends HttpServlet {
	
	Proveedor p = new Proveedor();
	private static final long serialVersionUID = 1L;
       
    public cProveedor() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    //-------------------------------------------------
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		//Capturamos los datos del formulario y los guardamos en el modelo(Proveedor.java)
		p.setRazonsocial(request.getParameter("rs"));
		p.setRuc(request.getParameter("ruc"));
		p.setTelefono(request.getParameter("fono"));
		p.setDireccion(request.getParameter("direccion"));
		p.setEstado(request.getParameter("estado"));
		p.registrar_proveedor(p); //Enviamos lo datos a la función del modelo
		response.sendRedirect("proveedor.jsp");
		System.out.println(p.getRuc() + "Pasó por el controlador cProveedor");
				
	}

}
