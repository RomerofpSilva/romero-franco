package POO;

public class MercadoApplication {

	public static void main(String[] args) {
		
		Mercado unidadeBlumenau = new Mercado("Giassi", 2000, 18.99, 3000, 20);
		
		System.out.println(unidadeBlumenau.nomeMercado + " Vendeu " + unidadeBlumenau.maca + " e seu preço é " + unidadeBlumenau.precom + " e tambem vendeu " + unidadeBlumenau.laranja + " ao preço de " + unidadeBlumenau.precom);
		
		Mercado unidadeJoinville = new Mercado("mangos", 4000, 12.99, 6000, 18.99);
				
		System.out.println(unidadeJoinville.nomeMercado + " Vendeu " + unidadeJoinville.maca + " e seu preço é " + unidadeJoinville.precom + " e tambem vendeu " + unidadeJoinville.laranja + " ao preço de " + unidadeJoinville.precom);

	
		Mercado unidadeDeFlorianopolis = new Mercado("Super Dudis", 5000, 11.99, 2000, 25);
		
		System.out.println(unidadeDeFlorianopolis.nomeMercado + " Vendeu " + unidadeDeFlorianopolis.maca + " e seu preço é " + unidadeDeFlorianopolis.precom + " e tambem vendeu " + unidadeDeFlorianopolis.laranja + " ao preço de " + unidadeDeFlorianopolis.precom);

		
		Mercado listaMercados[] = {unidadeBlumenau, unidadeDeFlorianopolis, unidadeJoinville};
		
		double maiorPrecoMacas = 0;
		Mercado mercadoMaiorReceitaMacas = null; 
		
		for (int i = 0; i < listaMercados.length; i++) {
			if (listaMercados[i].ObterPrecoMacas() > maiorPrecoMacas) {
				maiorPrecoMacas = listaMercados[i].ObterPrecoMacas();
				mercadoMaiorReceitaMacas = listaMercados[i];
			}
		}
		
		double menorPrecoLaranja = Double.MAX_VALUE;
		Mercado mercadoMenorReceitaMacas = null; 
		
		for (int i = 0; i < listaMercados.length; i++) {
			if (listaMercados[i].ObterPrecoMacas() > menorPrecoLaranja) {
				menorPrecoLaranja = listaMercados[i].ObterPrecoMacas();
				mercadoMenorReceitaMacas = listaMercados[i];
			}
		}
	
		System.out.println("Maior receita de maçãs ");
		
	}
	
}
