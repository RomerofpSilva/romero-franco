package gitDesktop;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner da = new Scanner(System.in);

        System.out.print("Digite sua altura (em metros): ");
        double altura = da.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = da.nextDouble();

        if (altura <= 0) {
            System.out.println("Altura inválida! Deve ser maior que zero.");
            da.close();
            return;
        }

        if (peso <= 0) {
            System.out.println("Peso inválido! Deve ser maior que zero.");
            da.close();
            return;
        }

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Magreza");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classificação: Saudável");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Classificação: Obesidade Grau II (severa)");
        } else {
            System.out.println("Classificação: Obesidade Grau III (mórbida)");
        }

        da.close();
    }
}