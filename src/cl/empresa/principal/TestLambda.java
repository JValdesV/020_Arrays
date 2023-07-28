package cl.empresa.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Clases.Cliente;
import Clases.Cuenta;
import Clases.CuentaAhorro;
import Clases.CuentaCorriente;

public class TestLambda {

	public static void main(String[] args) {
		//Creamos cuentas
				Cuenta cc1 = new CuentaCorriente(22,66);
				cc1.deposita(333.0);
				
				Cuenta cc2 = new CuentaAhorro(22, 55);
				cc2.deposita(444.0);
				
				Cuenta cc3 = new CuentaCorriente(22, 44);
				cc3.deposita(111.0);
				
				Cuenta cc4 = new CuentaCorriente(22, 33);
				cc4.deposita(678.0);
				
				//Creamos clientes y los asignamos a sus respectivas cuentas
				Cliente cli1 = new Cliente();
				cli1.setNombre("Javier");
				cc1.setTitular(cli1);
				
				Cliente cli2 = new Cliente();
				cli2.setNombre("Andres");
				cc2.setTitular(cli2);
				
				Cliente cli3 = new Cliente();
				cli3.setNombre("Fernando");
				cc3.setTitular(cli3);
				
				Cliente cli4 = new Cliente();
				cli4.setNombre("Oscar");
				cc4.setTitular(cli4);
				
				//Creamos una lista de cuentas
				List<Cuenta> lista = new ArrayList();
				lista.add(cc1);
				lista.add(cc2);
				lista.add(cc3);
				lista.add(cc4);
				
				//Vamos a trabajar con Expresion Lambda
				System.out.println("--------- Expresion Lambda ------------");
				
				lista.sort((Cuenta o1, Cuenta o2) -> {
					//return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
					return Integer.compare(o1.getNumero(), o2.getNumero());
				});
				
				//Foreach para representar los elementos por consola
				for(Cuenta cuenta:lista) {
					System.out.println(cuenta);
				}
				
				//Vamos a trabajar con Expresion Lambda
				System.out.println("--------- Expresion Lambda  2------------");
				Collections.sort(lista,(Cuenta o1, Cuenta o2) -> 
					o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre())
				);
				
				//Foreach para representar los elementos por consola
				for(Cuenta cuenta:lista) {
					System.out.println(cuenta);
				}
				
				//Aplicando un lambda para una lista aplicando un forEach
				System.out.println("--------- ForEach con Lambda  -------");
				//Consumer<T>
				lista.forEach((Cuenta cuenta) -> {
					System.out.println(cuenta);
				});
				
				

	}

}
