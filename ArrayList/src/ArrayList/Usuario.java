package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
	
		List<Integer> listaNumeros = new ArrayList<>();
				
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(4);
		listaNumeros.add(5);
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor que voce quer saber o indice");
		int numero  = input.nextInt();
		
		int indice = listaNumeros.indexOf(numero);
		
		if(indice != -1) {
			System.out.println("O valor " + numero + " está no índice");
		}else {
			System.out.println("O valor não está na lista");
		}

	}

}
