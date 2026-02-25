package metodos;

import java.util.Scanner;

public class ex1m {

	public static void main(String[] args) {

		imprimirNome();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número de um a quatro sendo 1=verão, 2=inverno...");
		int dig = input.nextInt();
		
		switch (dig) {
		case 1: {
			System.out.println("É verão e o tempo esta quente. ");
			 break;
		}case 2:{
			System.out.println("É Inverno e esta frio. ");
	        break;
		}case 3:{ 
			System.out.println("É outono e o clima esta ameno. ");
	        break;
		}case 4:{
			System.out.println("É primavera e esta fresco. ");
	        break;
		}
		
		default:System.out.println("Número invalido. ");
			throw new IllegalArgumentException("Unexpected value: " + dig);
		}
		
	}
	public static void imprimirNome() {
		System.out.println("");
		System.out.println("");
	}

}
