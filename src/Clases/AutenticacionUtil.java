package Clases;

public class AutenticacionUtil {
	
	private String clave;
	
	public String getClave() {
		return this.getClave();
	}

	public void setClave(String clave) {
		this.setClave(clave);
	}

	public boolean iniciarSesion(String clave) {
		if(clave == this.getClave()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	

}
