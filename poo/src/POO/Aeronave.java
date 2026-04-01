package POO;

public class Aeronave {

	private String modelo;
	private int passageiros;
	private double velocidadeMaxima;
	private int capacidadeDeCombustivel;
	private double queimaCombustivel;

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
	
// get e set 
	
	public String getModelo(String Modelo) {
		return Modelo;
	}



	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			System.out.println("Erro, modelo invalido");
		}else {
			this.modelo = modelo;
		}
	}



	public int getPassageiros() {
		return passageiros;
	}



	public void setPassageiros(int passageiros) {
		if (passageiros < 0) {
			System.out.println("Erro, quantidade invalida");
		}else {
			this.passageiros = passageiros;
		}
	}


	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}



	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}



	public int getCapacidadeDeCombustivel() {
		return capacidadeDeCombustivel;
	}



	public void setCapacidadeDeCombustivel(int capacidadeDeCombustivel) {
		this.capacidadeDeCombustivel = capacidadeDeCombustivel;
	}



	public double getQueimaCombustivel() {
		return queimaCombustivel;
	}



	public void setQueimaCombustivel(double queimaCombustivel) {
		this.queimaCombustivel = queimaCombustivel;
	}



	
}
