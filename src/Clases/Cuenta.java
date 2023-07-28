package Clases;

public abstract class Cuenta implements Comparable<Cuenta>{
	
	protected double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();
	
	public Cuenta() {
		
	}
	
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public Cuenta(double saldo, int agencia, int numero, Cliente titular) {
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}
	
	public abstract void deposita(double valor);
	
	
	public void saca(double valor) throws SaldoInsuficienteException{
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("No tienes saldo");
		}	
		this.saldo -= valor;
	}
	
	/*
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
		
	}
	*/
	
	public boolean transfiere(double valor, Cuenta destino){
		
		if(this.saldo >= valor) {
			//this.saldo -= valor;
			try {
				this.saca(valor);
			} catch (SaldoInsuficienteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", titular=" + titular + "]";
	}
	
	public boolean esIgual(Cuenta cuenta) {
		return this.agencia == cuenta.getAgencia() && this.numero == cuenta.getNumero();
	}
	
	@Override
	public boolean equals(Object obj) {
		Cuenta cuenta = (Cuenta) obj;
		return this.agencia == cuenta.getAgencia() && this.numero == cuenta.getNumero();
	}
	
	@Override
	public int compareTo(Cuenta o) {
		//Orden natural: Numero Cuenta
		//return Integer.compare(this.numero, o.getNumero());
		
		//Orden Natural: por monto de saldo
		return Double.compare(this.saldo, o.getSaldo());
		
	}
	
	

}
