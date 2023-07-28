package cl.empresa.principal;

import java.util.Vector;

import Clases.Cuenta;
import Clases.CuentaCorriente;

public class TestUtilVector {

	public static void main(String[] args) {
		
		//Crear el contenedor de datos
		Vector<Cuenta> vContenedor = new Vector<>();
		
		//Agregar elementos al vector
		CuentaCorriente cc1 = new CuentaCorriente(111, 123);
		CuentaCorriente cc2 = new CuentaCorriente(111, 369);
		
		vContenedor.add(cc1);
		vContenedor.add(cc2);
		
		//Acceder a los elementos
		for(int i=0; i<vContenedor.size();i++) {
			System.out.println(vContenedor.get(i));
		}
		
		//Eliminar un elemento del vector
		vContenedor.remove(1);
		
		//Acceder a los elementos
		for(int i=0; i<vContenedor.size();i++) {
			System.out.println(vContenedor.get(i));
		}
		
		//Verificamos si un elemento existe en el vector
		boolean elEsta = vContenedor.contains(cc1);
		
		if(elEsta) {
			System.out.println("La referencia está");
		}else {
			System.out.println("La referencia NO está");
		}
		
		//Vaciado del vector
		vContenedor.clear();
		
		//Acceder a los elementos
		for(int i=0; i<vContenedor.size();i++) {
			System.out.println(vContenedor.get(i));
		}
		
		//Esta vacio el vector
		System.out.println(vContenedor.isEmpty());
		
		
	}

}
