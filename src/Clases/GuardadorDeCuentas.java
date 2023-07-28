package Clases;

public class GuardadorDeCuentas {

	private Cuenta[] referencias;
	private int posicionLibre;
	
	//Metodo constructor que inicialia el objeto con la reserva de posiciones para almacenar elementos de tipo cuenta
	//y la creacion de una variable contador para saber las posiciones ocupadas
	public GuardadorDeCuentas() {
		this.referencias = new Cuenta[10];
		this.posicionLibre = 0;
	}

	public void adicionar(Cuenta ref) {
		referencias[this.posicionLibre] = ref;
		this.posicionLibre++;
		
	}

	public int getCantidadDeElementos() {
		return this.posicionLibre;
	}

	public Cuenta getReferencia(int posicion) {
		return this.referencias[posicion];
	}
	
	
}
