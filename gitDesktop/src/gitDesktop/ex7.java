package gitDesktop;

public class ex7 {

	public static void main(String[] args) {
	
		 int[] numeros = {11, 5, 7, 20, 45};

	        int maior = numeros[0];
	        int menor = numeros[0];
	        int soma = 0;

	        for (int i = 0; i < numeros.length; i++) {
	            soma += numeros[i];

	            if (numeros[i] > maior) {
	                maior = numeros[i];
	            }

	            if (numeros[i] < menor) {
	                menor = numeros[i];
	            }
	        }

	        double media = (double) soma / numeros.length;

	        System.out.println("Maior elemento: " + maior);
	        System.out.println("Menor elemento: " + menor);
	        System.out.println("Média dos elementos: " + media);

	}

}
