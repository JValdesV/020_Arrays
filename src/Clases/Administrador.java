package Clases;

public class Administrador extends Funcionario implements Autenticable {

	private AutenticacionUtil autentificador;
	
	public Administrador() {
		this.autentificador = new AutenticacionUtil();
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
	public double getBonificacion() {
		return 0.0;
	}

}
