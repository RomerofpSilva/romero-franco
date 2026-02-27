package metodos;

import java.util.Scanner;

public class ex1m {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Digite um número de um a quatro ");
		int dig = input.nextInt();
		
		switch (dig) {
		case 1: {
			imprimirVerao();
			 break;
		}case 2:{
			inverno();
	        break;
		}case 3:{ 
			outono();
	        break;
		}case 4:{
			primavera();
	        break;
		}
		
		default:System.out.println("Número invalido. ");
		
			throw new IllegalArgumentException("Unexpected value: " + dig);
		}
		
	}
	public static void imprimirVerao() {
		System.out.println("É verão e o tempo esta quente. ");
	}
	public static void inverno() {
		System.out.println("É Inverno e esta frio. ");
	}
	public static void outono() {
		System.out.println("É outono e o clima esta ameno. ");
	}
	public static void primavera() {
		System.out.println("É primavera e esta fresco. ");
	}

}
