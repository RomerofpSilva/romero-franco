package POO;

public class Aeronave {

	String modelo;
	int passageiros;
	double velocidadeMaxima;
	int capacidadeDeCombustivel;
	double queimaCombustivel;

	public Aeronave(String modelo, int passageiros, double velocidadeMaxima, int capacidadeDeCombustivel,
			double queimaCombustivel) {
		this.modelo = modelo;
		this.passageiros = passageiros;
		this.velocidadeMaxima = velocidadeMaxima;
		this.capacidadeDeCombustivel = capacidadeDeCombustivel;
		this.queimaCombustivel = queimaCombustivel;
	}

	@Override
	public String toString() {
		return "Aeronave [modelo=" + modelo + ", passageiros=" + passageiros + ", velocidadeMaxima=" + velocidadeMaxima
				+ ", capacidadeDeCombustivel=" + capacidadeDeCombustivel + ", queimaCombustivel=" + queimaCombustivel
				+ "]";
	}

	// b queima/capacidade

	public double ObterTempoNoAr() {
		return queimaCombustivel / capacidadeDeCombustivel;
	}

	// c velocidade*b

	public double ObterMaisDistancia() {
		return ObterTempoNoAr() * velocidadeMaxima;
	}
}
