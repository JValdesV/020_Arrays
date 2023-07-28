package cl.empresa.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Clases.Cliente;
import Clases.Cuenta;
import Clases.CuentaAhorro;
import Clases.CuentaCorriente;

public class TestOrdenarLista {

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
		
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta);
		}
		
		//Ordenar las cuentas a partir de su numero de cuenta
		Comparator<Cuenta> comparador = new OrdenadorPorNumeroCuenta();
		lista.sort(comparador);
		
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta);
		}
		
		//Creamos un separador
		System.out.println("-------------------------------------");
		
		//Crear la interfaz que ya fue implementada para ordenar por nombre
		Comparator<Cuenta> comparadorXNombre = new OrdenadorPorNombreTitularCuenta();
		
		//Recorrer la lista desordenada en cuanto a nombres
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta);
		}
		//Establecemos un delimitador
		
		System.out.println("----------------------------------------");
		
		lista.sort(comparadorXNombre);
		
		//Recorrer la lista desordenada en cuanto a nombres
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta);
		}
		
		Collections.sort(lista,new OrdenadorPorNumeroCuenta());
		System.out.println("Ordenamiento por Collections");
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta.toString());
		}
		
		Collections.sort(lista);
		System.out.println("Ordenamiento Natural asociando nuestra clase cuenta a la interfaz funcional comparable");
		System.out.println("Ordenamiento por monto de saldo en cuentas");
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta.toString());
		}
		
		//Vamos a trabajar con clases anonimas
		System.out.println("--------- Clase Anonima ------------");
		Collections.sort(lista,new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}
			
		});
		//Foreach para representar los elementos por consola
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta);
		}
		
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
		
		//Vamos a trabajar con clases anonimas
		System.out.println("--------- Clase Anonima ------------");
		Collections.sort(lista,new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}
			
		});
		

	}
	
	
	

}

 class OrdenadorPorNumeroCuenta implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		//Forma basica
		/*
		if(o1.getNumero() == o2.getNumero()) {
			return 0;
		}else if(o1.getNumero() > o2.getNumero()) {
			return 1;
		}else {
			return -1;
		}*/
		
		//Forma intermedia
		//return o1.getNumero() - o2.getNumero();
		
		//Forma Wrapper
		return Integer.compare(o1.getNumero(), o2.getNumero());
		
	}
	
}
 
 class OrdenadorPorNombreTitularCuenta implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
	}
	 
 }
 
