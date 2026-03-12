package metodos;

import java.util.Scanner;

public class ex6m {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("digite o nome: ");
		String nome = input.next();
		System.out.println("digite o seu sobrenome: ");
		String sobrenome = input.next();
		System.out.println("digite o sobrenome da mãe: ");
		String nomemae = input.next();
		System.out.println("digite o nome da sua cidade: ");
		String cidade = input.next();
		
		personagem(nome, sobrenome, nomemae, cidade );
		
	}
	
	public static void personagem(String nome, String sobrenome, String nomemae, String cidade) {
		
		String nomeSW = sobrenome.substring(0,3) + nome.substring(0,2);
		String sobreNomeSW = nomemae.substring(0,2) + cidade.substring(0,3);
		String nomeSaW = nomeSW + " " + sobreNomeSW;
		
		System.out.println("Seu nome Star Wars é " + nomeSaW);
	}

}
