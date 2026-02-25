package gitDesktop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class gitDesktop {

	public static void main(String[] args) {
		
		Scanner romero = new Scanner (System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Informe o número da matricula: ");
		String mat = romero.next();
		System.out.println("Informe seu nome: ");
		String nome = romero.next();
		System.out.println("Descreva a quantidade de horas trabalhadas: ");
		int hora = romero.nextInt();
		System.out.println("Digite o valor da sua hora de trabalho: ");
		double valorHora = romero.nextDouble();
		
		double preco = hora * valorHora;
		double salfinal = preco * 28;
		
		System.out.println("O salaria mensal esta no valor de: "+ salfinal);
		System.out.println("Número da matricula: " + mat);
		System.out.println("Nome: " + nome);
				
		
		
		
		
		
		romero.close();
	}

}
