package metodos;

import java.util.Scanner;

public class ex9m {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o numero: ");
		int n = input.nextInt();
		
		System.out.println(parImpar(n));
		
	}

	public static boolean parImpar(int n) {
		return n % 2 == 0;
		
	}
}
