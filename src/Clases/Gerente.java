package Clases;

public class Gerente extends Funcionario implements Autenticable{
	
	private String clave;

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		if(clave == this.clave) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public double getBonificacion() {
		return this.getSalario();
	}
	
	
	
}
