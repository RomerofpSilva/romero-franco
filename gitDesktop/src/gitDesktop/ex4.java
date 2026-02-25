package gitDesktop;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner silva = new Scanner(System.in);

		System.out.println("Digite o dia: ");
		int dia = silva.nextInt();

		if (dia > 31 || dia < 1) {
			System.out.println("dia invalido");

		} else {
			System.out.println("Digite o mês: ");
			int mes = silva.nextInt();
			if (mes < 1 || mes > 12) {
				System.out.println("mes invalido");
			} else {
				System.out.println("Digite o ano: ");
				int ano = silva.nextInt();
				if (ano < 1960 || ano > 2026) {
					System.out.println("ano invalido");
					
				}else {  
					System.out.println("Data valida. ");
			}
		}
			silva.close();
		}
	}
}