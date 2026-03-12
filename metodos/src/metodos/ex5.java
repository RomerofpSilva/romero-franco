package metodos;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número base: ");
        double base = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        double segundo = input.nextDouble();

        System.out.println("Digite o último número: ");
        double ultimo = input.nextDouble();

        primeiroValor(base, segundo, ultimo);

        input.close();
    }

    public static void primeiroValor(double base, double n1, double n2) {

        double distancia1 = Math.abs(base - n1);
        double distancia2 = Math.abs(base - n2);

        if (distancia1 < distancia2) {
            System.out.println("O número mais próximo do número base é: " + n1);
        } 
        else if (distancia2 < distancia1) {
            System.out.println("O número mais próximo do número base é: " + n2);
        } 
        else {
            System.out.println("Os dois números estão à mesma distância do número base.");
        }
    }
}