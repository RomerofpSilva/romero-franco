package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Elementos {

	public static void main(String[] args) {
	
		List<Integer> listaNumeros = new ArrayList<>();
		
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(4);
		listaNumeros.add(5);
		
		Collections.reverse(listaNumeros);
		System.out.println(listaNumeros);

	}

}
