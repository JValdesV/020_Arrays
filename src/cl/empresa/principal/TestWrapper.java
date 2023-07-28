package cl.empresa.principal;

import java.util.ArrayList;
import java.util.List;

public class TestWrapper {

	public static void main(String[] args) {
		
		//Creacion de un array convencional
		int[] numeros = new int[10];
		int numero = 40;
		//Creeacion de una lista generica 
		List lista = new ArrayList();
		lista.add(numero);
		//Comprobamos si la variable primitiva se guarda en la lista
		System.out.println(lista.get(0));
		
		System.out.println("---------------------------------------");
		
		//Vamos a crear un variable wrapper para envolver un primitivo de tipo int
		Integer numeroObjeto = new Integer(40);
		
		//Creacion de lista para tratar Integer
		List<Integer> listaWrapperInteger = new ArrayList<Integer>();
		listaWrapperInteger.add(numeroObjeto);
		listaWrapperInteger.add(numero);
		
		
		System.out.println(listaWrapperInteger.get(0));
		System.out.println(listaWrapperInteger.get(1));
		
		//Vamos a realizar conversiones de wrapper integer a primitivo
		Integer intWrapper = 76;
		int intValue = intWrapper.intValue();
		System.out.println(intValue);
		
		//Auto-Un boxing 
		
		//Autoboxing
		int intValue2 = 10;
		Integer intWrapper2 = intValue2;
		Integer intWraper3 = Integer.valueOf(95);
		System.out.println(intWraper3);
		
		
		//Unboxing
		double  doubleValue = 3.14;
		Double doubleWrapper = doubleValue;
		doubleValue = doubleWrapper;
		
		Integer intWrap = Integer.valueOf(10);
		intWrap++;
		System.out.println(intWrap);
		
		
	}

}
