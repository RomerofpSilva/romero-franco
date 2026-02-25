package gitDesktop;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner franco = new Scanner(System.in);
		
		 System.out.print("Digite a massa inicial em kg: ");
	        double massaInicial = franco.nextDouble();

	        double massaAtual = massaInicial;
	        int tempo = 0;

	        while (massaAtual >= 0.0005) {
	            massaAtual = massaAtual / 2;
	            tempo = tempo + 50;
	        }

	        System.out.println("Massa inicial: " + massaInicial + " kg");
	        System.out.println("Massa final: " + massaAtual + " kg");
	        System.out.println("Tempo necessario: " + tempo + " segundos");

	        franco.close();
		
		
		
		

	}

}