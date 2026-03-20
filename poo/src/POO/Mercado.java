package POO;

public class Mercado {

	String nomeMercado;
	int maca;
	double precom;
	int laranja;
	double precol;

	public double ObterPrecoMacas() {
		return precom *  maca;
	}
	
	public double ObterPrecolaranja() {
		return precol *  laranja;
	}
	
	public double ObterReceitaTotal() {
		return ObterPrecoMacas() + ObterPrecolaranja();
	}	
	
	
}
