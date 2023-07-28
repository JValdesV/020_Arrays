package cl.empresa.principal;

import java.util.ArrayList;

import Clases.Cuenta;
import Clases.CuentaAhorro;
import Clases.CuentaCorriente;

public class TestArrayList {

	public static void main(String[] args) {
		
		//Creamos una variable de tipo lista
		ArrayList<Cuenta> lista = new ArrayList();
		
		//Creamos dos objetos de cuentas diferentes 
		Cuenta cc = new CuentaCorriente(222, 123);
		Cuenta cc2 = new CuentaAhorro(222, 456);
		Cuenta cc3 = new CuentaAhorro(222, 456);
		// Referencia     Objeto -> Heap
		
		//Agregamos los dos objetos cuentas a nuestra lista
		lista.add(cc);
		lista.add(cc2);
		lista.add(cc3);
		
		//Extraemos un elemento de la lista y lo casteamos para poder utilizarlo
		Cuenta obtenerCuenta = (CuentaAhorro)lista.get(1);
		//System.out.println(obtenerCuenta.toString());
		
		//Ciclo for
		/*for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}*/
		
		//Ciclo foreach generico
		/*for(Object cuenta: lista) {
			System.out.println(cuenta);
		}*/
		
		//Ciclo foreach
		for(Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		
		boolean contiene = lista.contains(cc3);
		//Comparacion por referencia
		if(contiene) {
			System.out.println("Si");
		}
		
		//Comparacion por valores
		if(cc2.esIgual(cc)) {
			System.out.println("Si, son iguales");
		}
		
		//Comparacion por valores
		if(cc3.equals(cc2)) {
			System.out.println("Si, son iguales");
		}
		
		
	}

}
