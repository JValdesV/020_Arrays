package cl.empresa.principal;

public class TestArrays {

	public static void main(String[] args) {
		
		//Creamos un array de tipo entero que tiene 5 posiciones
		int elementos[] = new int[3];
		//Realizamos las asginaciones de posiciones con sus respectivos valores
		elementos[0] = 10;
		elementos[1] = 20;
		elementos[2] = 30;
		
		//Iteramos el array con un ciclo for convencional
		for(int i=0; i<3; i++) {
			System.out.println(elementos[i]);
		}
		
		//Iteramos el array con un ciclo foreach
		for(int elemento:elementos) {
			System.out.println(elemento);
		}
		
		//Creacion de array y asignacion de valor a cada una de sus posiciones respectivamente
		int[] refs = {1,2,3,4,5};
		
		//Iteracion del array con foreach y for
		for(int e:refs) {
			System.out.println(e);
		}
		
		for(int i=0; i<refs.length; i++) {
			System.out.println("Posicion: "+i+" Valor:"+refs[i]);
		}
		

	}

}
