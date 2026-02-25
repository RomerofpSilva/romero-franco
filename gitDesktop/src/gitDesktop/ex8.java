package gitDesktop;

public class ex8 {

	public static void main(String[] args) {

		int[][] matriz = { { 210, 3, 399900 }, { 160, 3, 329900 }, { 240, 3, 369000 }, { 141, 2, 232000 },
				{ 300, 4, 539900 }, { 198, 4, 299900 }, { 153, 3, 314900 }, { 142, 3, 199000 }, { 138, 3, 212000 },
				{ 149, 3, 242500 }, { 194, 4, 240000 }, { 200, 3, 347000 }, { 189, 3, 330000 }, { 447, 5, 699900 },
				{ 126, 3, 259900 } };

		double somaPrecos = 0;

		for (int i = 0; i < matriz.length; i++) {
			somaPrecos += matriz[i][2];
		}

		double mediaPrecos = somaPrecos / matriz.length;
		System.out.println("a) Média dos preços: " + mediaPrecos);

		int menorTamanho = Integer.MAX_VALUE;
		int linhaMenorCasa = 0;

		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][0] < menorTamanho) {
				menorTamanho = matriz[i][0];
				linhaMenorCasa = i;
			}
		}

		int precoMenorCasa = matriz[linhaMenorCasa][2];
		System.out.println("b) Preço da menor casa: " + precoMenorCasa);

		int maiorQtdQuartos = Integer.MIN_VALUE;
		int menorQtdQuartos = Integer.MAX_VALUE;
		int tamanhoMaiorQuartos = 0;
		int tamanhoMenorQuartos = 0;

		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][1] > maiorQtdQuartos) {
				maiorQtdQuartos = matriz[i][1];
				tamanhoMaiorQuartos = matriz[i][0];
			}

			if (matriz[i][1] < menorQtdQuartos) {
				menorQtdQuartos = matriz[i][1];
				tamanhoMenorQuartos = matriz[i][0];
			}
		}

		int diferencaTamanho = tamanhoMaiorQuartos - tamanhoMenorQuartos;
		System.out.println("c) Diferença de tamanho: " + diferencaTamanho);

		int somaTamanhos = 0;
		int contador = 0;

		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][2] > 300000) {
				somaTamanhos += matriz[i][0];
				contador++;
			}
		}

		if (contador > 0) {
			double mediaTamanhos = (double) somaTamanhos / contador;
			System.out.println("d) Média do tamanho das casas acima de 300.000: " + mediaTamanhos);
		} else {
			System.out.println("d) Não há casas acima de 300.000");
		}
	}
}