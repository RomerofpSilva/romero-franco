package metodos;

import java.util.Scanner;

public class ex4m {

	public static void main(String[] args) {
		
		int vetor[] = { 1, 2, 3, 4, 5};
		info(vetor);		
		info1(vetor);
		info2(vetor);
	}
	
	public static void info(int vetor[]) {
		
		int maiorv = Integer.MIN_VALUE;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorv) {
				maiorv = vetor[i];
				}
			}
		System.out.println(maiorv);
		}
	public static void info1(int vetor[]) {
		
int menorv = Integer.MAX_VALUE;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menorv) {
				menorv = vetor[i];
				}
			}
		System.out.println(menorv);
		}
	
	public static void info2(int vetor[]) {
		
		int soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		double media = soma / vetor.length;

		System.out.println(media);
		
		}
	
}

	
