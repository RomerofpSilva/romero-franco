package heranca;

public abstract class animal {

	private String especie;
	private double peso;
	
	
	public animal(String especie, double peso) {
		super();
		this.especie = especie;
		this.peso = peso;
	}
	
	public abstract String EmitirSom(String som);
	
	
	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		if(especie == null || especie.isBlank()) {
			throw new IllegalArgumentException("especie invalida");
		}
		this.especie = especie;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		if(peso <= 0 ) {
			throw new IllegalArgumentException("Peso invalido");
		}
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "animal [especie=" + especie + ", peso=" + peso + "]";
	}

}
