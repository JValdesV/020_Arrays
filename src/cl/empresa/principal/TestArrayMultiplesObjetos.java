package cl.empresa.principal;

import Clases.Cliente;
import Clases.Cuenta;
import Clases.CuentaAhorro;
import Clases.CuentaCorriente;

public class TestArrayMultiplesObjetos {

	public static void main(String[] args) {
		
		//Aqui creamos 2 objetos de tipo cuenta
		CuentaCorriente cc = new CuentaCorriente(111, 123);
		CuentaAhorro ca = new CuentaAhorro(111, 334);
		
		//Creamos un array de tipo cuenta
		Cuenta[] cuentas = new Cuenta[5];
		
		cuentas[0] = cc;
		//Exception es un error de tipo checked
		cuentas[1] = ca;
		
		for(Cuenta cuenta: cuentas) {
			System.out.println(cuenta);
		}
		
		//Vamos a tomar un objeto del array y lo vamos a cargar en uno nuevo
		
		CuentaAhorro ca1 = (CuentaAhorro)cuentas[1];
		System.out.println(ca1.toString());
		
		System.out.println("----------------------------");
		
		//Vamos a crear un cliente
		Cliente cl = new Cliente("758889992", 74578596, "Javier");
		
		//Vamos a crear un contenedor mas generico
		Object[] objetos = new Object[5];
		objetos[0] = cc;
		objetos[1] = ca;
		objetos[2] = cl;
		
		try {
			for(Object obj: objetos) {
				System.out.println(obj.toString());
			}
			
		}catch(NullPointerException e) {
			e.getStackTrace();
		}
		
		

	}

}
