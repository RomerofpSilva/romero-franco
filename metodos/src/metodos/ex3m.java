package metodos;

import java.util.Scanner;



public class ex3m {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = input.nextInt();
		
		num(numero);
		
		input.close();
	}
	

	public static void num(int numero) {
		
		for (int i = numero; i <= numero + 20; i++) {
			System.out.println(i);
		}
		
	}
	
}
