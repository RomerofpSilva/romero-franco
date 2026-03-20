package POO;

public class aaa {
	public Mercado(String nomeMercado, int maca, double precom, int laranja, double precol) {
		super();
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
