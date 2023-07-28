package cl.empresa.principal;

import Clases.Cuenta;
import Clases.CuentaCorriente;
import Clases.GuardadorDeCuentas;

public class TestClasesAGuardar {

	public static void main(String[] args) {
		//Creamos un objeto que nos delega el almacenamiento de objetos de tipo cuenta
		GuardadorDeCuentas guardador = new GuardadorDeCuentas();
		
		//Creamos 2 cuentas corrientes disponibles para ser almacenadas en el objeto guardador
		Cuenta cc = new CuentaCorriente(22,11);		
		guardador.adicionar(cc);
		
		Cuenta cc2 = new CuentaCorriente(22,22);
		guardador.adicionar(cc2);
		
		//Obtenemos la cantidad de elementos o espacios ocupados
		int tamano = guardador.getCantidadDeElementos();
		System.out.println(tamano);
		
		//Obtenemos el objeto a partir de su posicion
		Cuenta ref = guardador.getReferencia(0);
		System.out.println(ref.toString());

	}

}
