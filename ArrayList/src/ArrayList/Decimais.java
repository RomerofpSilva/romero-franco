package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Decimais {
		
	public static void main(String[] args) {
		
		List<Integer> listaDecimais = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		
		while(numero != 0) {
			listaDecimais.add(numero);		
		}
		
		int menorElemento = Collections.min(listaDecimais);
		int maiorElemento = Collections.max(listaDecimais);
		double soma = 0;
		
		for(int i = 0; i < listaDecimais.size(); i++) {
			soma += listaDecimais.get(i);
		}
		
		double media = soma / listaDecimais.size();
		
		System.out.println(maiorElemento);
		System.out.println(menorElemento);
		System.out.println(media);
		
	}

}