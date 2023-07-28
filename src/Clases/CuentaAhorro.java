package Clases;

public class CuentaAhorro extends Cuenta{

	
	public CuentaAhorro(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;		
	}

	@Override
	public String toString() {
		return "CuentaAhorro: " + super.toString();
	}

	
	
	
	
}
