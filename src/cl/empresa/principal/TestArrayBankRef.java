package cl.empresa.principal;

import Clases.Cuenta;
import Clases.CuentaAhorro;
import Clases.CuentaCorriente;

public class TestArrayBankRef {

	public static void main(String[] args) {
		
		Cuenta[] cuentas = new Cuenta[5];
		CuentaCorriente cc1 = new CuentaCorriente(222,123);
		cuentas[0] = cc1;
		
		CuentaAhorro ca2 = new CuentaAhorro(222, 321);
		cuentas[1] = ca2;
		
		System.out.println(cuentas[1].getNumero());
		
		//Alternativa 1 con la utilizacion del cast de objeto
		CuentaCorriente ref = (CuentaCorriente)cuentas[0];
		System.out.println(cc1.getNumero());
		System.out.println(ref.getNumero());
		
		//Alternativa 2 utilizando la referencia mas global
		Cuenta ref1 = cuentas[0];
		System.out.println(cc1.getNumero());
		System.out.println(ref1.getNumero());
		
		CuentaAhorro refA = (CuentaAhorro)cuentas[1];
		Cuenta refB = cuentas[1];
		System.out.println(refA.getAgencia());
		System.out.println(refB.getAgencia());
		

	}

}
