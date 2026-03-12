package metodos;

import java.util.Scanner;

public class ex2m {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número de um a quatro ");
		String nome = input.next();
		
		switch (nome) {
		case "Yuri": 
			yuri();
			break;
		
		case "Eduardo": 
			dudu();
			break;
		
		case "Pedro": 
			pedro();
			break;
		
		case "Kevin": 
			kevin();
			break;
		
		case "João": 
			joao();
			break;
		
		case "Guilherme": 
			gui();
			break;
		
		default:System.out.println("Informação invalida. ");
		
		throw new IllegalArgumentException("Unexpected value: " + nome);
		}

	}
	public static void yuri()  { 
		System.out.println("O nome dele é Yuri \nEle tem 19 anos \nEle é estudante de desenvolvimento de sistemas");
	} 
	public static void dudu()  { 
		System.out.println("O nome dele é Eduardo \nEle tem 21 anos \nEle é estudante de desenvolvimento de sistemas");
	} 
	public static void pedro()  { 
		System.out.println("O nome dele é Pedro \nEle tem 19 anos \nEle é estudante de desenvolvimento de sistemas");
	} 
	public static void kevin()  { 
		System.out.println("O nome dele é Kevin \nEle tem 19 anos \nEle é estudante de desenvolvimento de sistemas");
	} 
	public static void joao()  { 
		System.out.println("O nome dele é João \nEle tem 20 anos \nEle é estudante de desenvolvimento de sistemas");
	} 
	public static void gui()  { 
		System.out.println("O nome dele é Guilherme \nEle tem 25 anos \nEle é estudante de desenvolvimento de sistemas");
	} 
		
	

}
