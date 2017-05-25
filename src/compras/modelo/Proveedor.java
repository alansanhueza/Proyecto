package compras.modelo;

public class Proveedor {
	
	public int idproveedor;
	public String ruc;
	public String razonsocial;
	public String direccion;
	public String telefono;
	public String estado;
	

	public Proveedor() {
		// TODO Auto-generated constructor stub
	}


	public int getIdproveedor() {
		return idproveedor;
	}


	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}


	public String getRuc() {
		return ruc;
	}


	public void setRuc(String ruc) {
		this.ruc = ruc;
	}


	public String getRazonsocial() {
		return razonsocial;
	}


	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}

}
