package POO;

public class Mercado {

	String nomeMercado;
	int maca;
	double precom;
	int laranja;
	double precol;
	
	public Mercado(String nomeMercado, int maca, double precom, int laranja, double precol) {
		this.nomeMercado = nomeMercado;
		this.maca = maca;
		this.precom = precom;
		this.laranja = laranja;
		this.precol = precol;
	}
	
	@Override
	public String toString() {
		return "Mercado [nomeMercado=" + nomeMercado + ", maca=" + maca + ", precom=" + precom + ", laranja=" + laranja
				+ ", precol=" + precol + "]";
	}

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
