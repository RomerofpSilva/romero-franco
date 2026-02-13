
import java.util.Scanner;

public class dozeDoDois 

{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		String nome = input.next();
		
		System.out.println("\nInsira sua idade: ");
		int idade = input.nextInt();
		
		System.out.println("Seu nome é " + nome + " e voce tem "+idade);
		
		System.out.println("\nInsira a sua idade: ");
		int idade1 = input.nextInt();
		
		System.out.println("Insira a sua idade: ");
		int idade2 = input.nextInt();
		
		int somaIdade = idade1 + idade2;
		
		System.out.println("A soma das idades é de: " + somaIdade);
		
		System.out.println("\nDigite o preço do produto: ");
		double preco1 = input.nextDouble();
		
		System.out.println("Digite o preço do segundo produto: ");
		double preco2 = input.nextDouble();
		
		double somaPreco = preco1 + preco2;
		
		System.out.println("A soma dos preços é de:" + somaPreco);
		
		System.out.println("\nDigite a sua altura: ");
		double altura1 = input.nextDouble();
		
		System.out.println("Digite novamente a sua altura: ");
		double altura2 = input.nextDouble();
		
		double difeAltura = altura1 - altura2;
				
		System.out.println("A diferença das alturas é de: " + difeAltura);
		
		System.out.println("\nDigite a altura do retâmgulo: ");
		double alturar = input.nextDouble();
		
		System.out.println("Digite a largura do retâmgulo: ");
		double largura =  input.nextDouble();
		
		double perimetro = (alturar + largura)*2;
				
		double area = alturar * largura;
		
		System.out.println("O perimetro do retângulo é " + perimetro + " e a área do retângulo é " + area);
		
		System.out.println("\nDigite seu nome: ");
		String nomeu = input.next();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = input.next();
		
		String nomeCompleto = nomeu + " " + sobrenome;
		
		System.out.println("Seu nome é " + nomeCompleto);
		
		
		

	}

}
