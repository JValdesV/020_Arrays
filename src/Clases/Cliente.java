package Clases;

public class Cliente implements Autenticable{
	
	//Atributos
	private String documento;
	private int telefono;
	private String nombre;
	private static int contar = 0;
	private AutenticacionUtil autentificador;
	
	
	//Constructores
	
	public Cliente() {
		contar();
		this.autentificador = new AutenticacionUtil();
	}
	
	public Cliente(String documento, int telefono, String nombre) {
		this.documento = documento;
		this.telefono = telefono;
		this.nombre = nombre;
	}
	
	//Metodos

	public void mostrarCliente() {
		System.out.println(this.documento + " " + this.nombre + " "+ this.telefono);
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private static void contar() {
		contar += 1;
	}
	
	public static int getContar() {
		return contar;
	}

	@Override
	public String getClave() {
		return this.autentificador.getClave();
	}

	@Override
	public void setClave(String clave) {
		this.autentificador.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		if(clave == this.autentificador.getClave()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Cliente [documento=" + documento + ", telefono=" + telefono + ", nombre=" + nombre + ", autentificador="
				+ autentificador + "]";
	}


	
	
	
	
	
}
