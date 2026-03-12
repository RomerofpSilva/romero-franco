package metodos;

import java.util.Scanner;

public class ex8m {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a nota:");
		double nota1 = input.nextDouble();
		
		System.out.println("Digite a nota:");
		double nota2 = input.nextDouble();
		
		System.out.println("Digite a nota:");
		double nota3 = input.nextDouble();
		
		double media = calcularMedia(nota1, nota2, nota3);

		System.out.println("A média é: " + media);
	}
	
	public static double calcularMedia(double nota1, double nota2, double nota3) {
		
		return (nota1 + nota2 + nota3) / 3;
		
	}

}
