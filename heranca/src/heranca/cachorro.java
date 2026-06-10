package heranca;

public class cachorro extends animal {

	private String raca;

	public cachorro(String especie, double peso, String raca) {
		super(especie, peso);
		this.raca = raca;
	}

	
	@Override
	public String EmitirSom(String som) {
		
		return "Au au";
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		if(raca == null || raca.isBlank()) {
			throw new IllegalArgumentException("raca invalida");
		}
		
		this.raca = raca;
	}


	@Override
	public String toString() {
		return "cachorro [raca=" + raca + "]";
	}	
	
}
