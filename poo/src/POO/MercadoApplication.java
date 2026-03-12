package POO;

public class MercadoApplication {

	public static void main(String[] args) {
		
		Mercado unidadeBlumenau = new Mercado();
		
		unidadeBlumenau.nomeMercado = "Cooper";
		unidadeBlumenau.maca = 2000;
		unidadeBlumenau.precom = 5000;
		unidadeBlumenau.laranja = 5000;
		unidadeBlumenau.precol = 10000;
		
		System.out.println(unidadeBlumenau.nomeMercado + " Vendeu " + unidadeBlumenau.maca + " e seu preço é " + unidadeBlumenau.precom + " e tambem vendeu " + unidadeBlumenau.laranja + " ao preço de " + unidadeBlumenau.precom);
		
		Mercado unidadeJoinville = new Mercado();
		
		unidadeJoinville.nomeMercado = "Cooper";
		unidadeJoinville.maca = 3000;
		unidadeJoinville.precom = 5000;
		unidadeJoinville.laranja = 6000;
		unidadeJoinville.precol = 10000;
		
		System.out.println(unidadeJoinville.nomeMercado + " Vendeu " + unidadeJoinville.maca + " e seu preço é " + unidadeJoinville.precom + " e tambem vendeu " + unidadeJoinville.laranja + " ao preço de " + unidadeJoinville.precom);

	
		Mercado unidadeDeFlorianopolis = new Mercado();
		
		unidadeDeFlorianopolis.nomeMercado = "Koch";
		unidadeDeFlorianopolis.maca = 2000;
		unidadeDeFlorianopolis.precom = 5000;
		unidadeDeFlorianopolis.laranja = 5000;
		unidadeDeFlorianopolis.precol = 10000;
		
		System.out.println(unidadeDeFlorianopolis.nomeMercado + " Vendeu " + unidadeDeFlorianopolis.maca + " e seu preço é " + unidadeDeFlorianopolis.precom + " e tambem vendeu " + unidadeDeFlorianopolis.laranja + " ao preço de " + unidadeDeFlorianopolis.precom);

	
	}

}
