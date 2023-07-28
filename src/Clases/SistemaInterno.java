package Clases;

public class SistemaInterno {
	
	private String clave = "789";
	
	public boolean autentica(Autenticable objeto) {
		boolean puedeIniciarSesion = objeto.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login Exitoso");
			return true;
		}else {
			System.out.println("Error en el login");
			return false;
		}
	}

}
