package POO;

public class MercadoConstrutor {

	public static void main(String[] args) {
		
		Mercado unidadeBlumenau = new Mercado();
		
		unidadeBlumenau.nomeMercado = "Cooper";
		unidadeBlumenau.maca = 2000;
		unidadeBlumenau.precom = 5000;
		unidadeBlumenau.laranja = 5000;
		unidadeBlumenau.precol = 10000;
		
		Mercado unidadeJoinville = new Mercado();
		
		unidadeJoinville.nomeMercado = "Cooper";
		unidadeJoinville.maca = 3000;
		unidadeJoinville.precom = 5000;
		unidadeJoinville.laranja = 6000;
		unidadeJoinville.precol = 10000;
	
		Mercado unidadeDeFlorianopolis = new Mercado();
		
		unidadeDeFlorianopolis.nomeMercado = "Koch";
		unidadeDeFlorianopolis.maca = 2000;
		unidadeDeFlorianopolis.precom = 5000;
		unidadeDeFlorianopolis.laranja = 5000;
		unidadeDeFlorianopolis.precol = 10000;
		
		Mercado listaMercados[] = {unidadeBlumenau, unidadeDeFlorianopolis, unidadeJoinville};
		
		double maiorPrecoMacas = 0;
		Mercado mercadoMaiorReceitaMacas = null; 
		
		for (int i = 0; i < listaMercados.length; i++) {
			if (listaMercados[i].ObterPrecoMacas() > maiorPrecoMacas) {
				maiorPrecoMacas = listaMercados[i].ObterPrecoMacas();
				mercadoMaiorReceitaMacas = listaMercados;
			}
		}
		
		double menorPrecoLaranja = Double.MAX_VALUE;
		Mercado mercadoMenorReceitaMacas = null; 
		
		for (int i = 0; i < listaMercados.length; i++) {
			if (listaMercados[i].ObterPrecoMacas() > menorPrecoLaranja) {
				menorPrecoLaranja = listaMercados[i].ObterPrecoMacas();
				mercadoMenorReceitaMacas = listaMercados;
			}
		}
	
		System.out.println("Maior receita de maçãs ");
		
	}
	
}
