package compras.modelo;

public class Producto {

	public String idcod;
	public String codigo;
	public String nombre;
	public String categoria;
	public String descripcion;
	public String estado;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public String getIdcod() {
		return idcod;
	}

	public void setIdcod(String idcod) {
		this.idcod = idcod;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

		//Métodos
		public int registrar_Producto(){
			int res = 0;
			return res;		
		}
		
		public int actualizar_Producto(){
			int res = 0;
			return res;	
		}
		public int eliminar_Producto(){
			int res = 0;
			return res;	
	    }
		public void listar_Producto(){
			
		}
}
