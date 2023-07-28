package cl.empresa.principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterador {

	public static void main(String[] args) {
		
		List<String> nombres = new ArrayList<>();
		nombres.add("Super Mario");
		nombres.add("Yoshi");
		nombres.add("Donkey Kong");
		
		Iterator<String> it = nombres.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}		

	}

}
