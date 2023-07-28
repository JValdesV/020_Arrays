package cl.empresa.principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIteratorFiltrando {

	public static void main(String[] args) {
		
		//Creamos una lista
		List<Persona> personas = new ArrayList<>();
		
		//Agregamos instancias de personas
		personas.add(new Persona("Javier",26));
		personas.add(new Persona("Andres",35));
		personas.add(new Persona("Pedro",18));
		personas.add(new Persona("Fernando",22));
		
		//Recorrer nuestra lista on el patron iterator
		Iterator<Persona> it = personas.iterator();
		
		//Vamos a iterar la lista y en base a un criterio determinado realizar una actualizacion o modificacion de atributos del objeto de la lista
		
		while(it.hasNext()) {
			//Vamos a crear un objeto contendor para leer las propiedades del objeto que se esta iterando actualmente
			Persona persona = it.next();
			
			//Vamos a establecer el criterio para realziar la modificacion
			if(persona.getEdad() <= 25 ) {
				persona.setEdad(30);
			}
			
		}
		
		personas.forEach(obj1 -> System.out.println(obj1));
		
		//Recorrer nuestra lista on el patron iterator
		Iterator<Persona> it1 = personas.iterator();
		
		it = personas.iterator();
		
		//Vamos a utilizar el metodo remove de la interfaz
		
		while(it.hasNext()) {
			//Vamos a crear un objeto contendor para leer las propiedades del objeto que se esta iterando actualmente
			Persona persona1 = it.next();
			
			//Vamos a establecer el criterio para realizar la modificacion
			if(persona1.getEdad() == 30 ) {
				it.remove();
				System.out.println("Trate de eliminar algo");
			}
			
		}
		
		personas.forEach(obj1 -> System.out.println(obj1));
		
		
	}

}


class Persona{
	
	private String nombre;
	private int edad;
	
	public Persona() {
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
}
