import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		System.out.println("Valor dos produtos comprados:");
		System.out.println("Baly 2L: 11,98");
		System.out.println("Chiclete trident: 12,95");
		double preco1 = 11.98;
		double preco2 = 12.95;
		double somaPrecos = preco1 + preco2;
		System.out.println("\nVocê deve pagar: " + somaPrecos);
		
		System.out.println("\n-------------\n");

		System.out.println("Altura de duas pessoas: \nPessoa 1: 1,95 metros\nPessoa 2: 1,60 metros\n");
		double pessoa1 = 1.95;
		double pessoa2 = 1.60;
		double diferencaAltura = pessoa1 - pessoa2;
		System.out.println("Diferença de altura: " + diferencaAltura + " metros");
		
		System.out.println("\n-------------\n");
		
		
		System.out.println("Largura do triângulo: 2,5\nAltura do trângulo: 4,7\n");
		
		double largura = 2.5;
		double altura = 4.7;
		double area = altura * largura;
		double perimetro = (altura + largura) * 2;
	
			
		System.out.println("O perímetro do retângulo é de: " + perimetro + " metros\nA área do retângulo é de: " + area + " metros" );
		
		System.out.println("\n-------------\n");

		System.out.println("Nome: Yuri\nSobrenome: Budke");
		String nome = "Yuri";
		String sobrenome = "Budke";
		String nomeCompleto = nome + " " + sobrenome;
		System.out.println("Meu nome completo é: " + nomeCompleto);
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira seu nome: ");
		String nome2 = input.next();
		System.out.println("O seu nome é: " + nome2);
		
		System.out.println("\n-------------\n");
		
		System.out.println("Insira sua idade: ");
		
	}

}
