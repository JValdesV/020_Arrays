package Clases;

public class ControlBonificacion {

	private double suma;
	
	public double registrarBonificacion(Funcionario f) {
		this.suma += f.getBonificacion();
		return this.suma;
	}
	
	public void mostrarSuma() {
		System.out.println(this.suma);
	}
	
}
