package metodos;

import java.util.Scanner;


public class ex7m {

	public static void main(String[] args) {

				Scanner input = new Scanner(System.in);
				
				System.out.println("Insira o número da estação: ");
				int estacao = input.nextInt();
				
				if (estacao == 1) {
					System.out.println(rVerao());
				}else if (estacao == 2) {
					System.out.println(rInverno());
				}else if (estacao == 3) {
					System.out.println(rOutono());
				}else if (estacao == 4) {
					System.out.println(rPrimavera());
				}else {
					System.out.println("Escolha errada.");
				}
				
			}
			
			public static String rVerao() {
				return "É verão e o tempo está quente";
			}
			public static String rInverno() {
				return "É inverno e esta frio";
			}
			public static String rOutono() {
				return "É outono e o clima esta ameno";
			}
			public static String rPrimavera() {
				return "É primavera e esta um clima agradavel";
			}

		}