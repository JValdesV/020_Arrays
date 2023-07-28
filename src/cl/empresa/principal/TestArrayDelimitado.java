package cl.empresa.principal;

import java.util.ArrayList;

public class TestArrayDelimitado {

	public static void main(String[] args) {
		
		//Creamos un arraylist para agregar regiones
		ArrayList lista = new ArrayList(16);
		lista.add("Bio Bio");
		lista.add("Maule");
		//Tomamos el arraylist lista y le agreamos las regiones
		ArrayList nuevo = new ArrayList(lista);
		
		nuevo.add("Los Rios");
		nuevo.add("Los Lagos");
		
		nuevo.remove(3);
		
		for(int i=0; i<nuevo.size(); i++) {
			System.out.println(nuevo.get(i));
		}
		

	}

}
