package Clases;

public class CuentaCorriente extends Cuenta implements Tributacion{
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorARetirar = valor + 0.2;
		super.saca(valorARetirar);
	}


	@Override
	public void deposita(double valor) {
		this.saldo += valor;			
	}


	@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}


	@Override
	public String toString() {
		return "CuentaCorriente: "+super.toString();
	}
	
	
	
	
	
	
}
