package cl.empresa.principal;

import Clases.CuentaCorriente;

public class TestArregloCuentas {

	public static void main(String[] args) {
		
		//Creamos las cuentas 
		CuentaCorriente cc1 = new CuentaCorriente(111, 456);
		CuentaCorriente cc2  =  new CuentaCorriente(789, 123);
		
		//Creamos un array de cuentas
		CuentaCorriente[] cuentas = new CuentaCorriente[5];
		
		//Asginar los espacios de memoria con las respectivas cuentas
		cuentas[0] = cc1;
		cuentas[1] = cc2;
		
		for(int i = 0; i<cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
		
		
		
		
	}

}
