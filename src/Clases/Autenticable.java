package Clases;

public interface Autenticable {

	public String getClave();

	public void setClave(String clave);
	
	public boolean iniciarSesion(String clave);

	
	
	
}
