package gitDesktop;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner franco = new Scanner(System.in);
		
		System.out.println("digite seu nome: ");
		String nome = franco.next();
		
		System.out.println("Digite seu salario fixo: ");
		double sal = franco.nextDouble();
		
		System.out.println("Digite o total de vendas: ");
		double tVendas = franco.nextDouble();
		
		double com = (tVendas/100)*3;
		double comsal = com + sal;
		
		System.out.println("o salario de " + nome + " desse mês foi de: " + comsal);
		
		franco.close();

	}

}
