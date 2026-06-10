package heranca;

public class gato extends animal {

	private Boolean castrado;

	public gato(String especie, double peso, Boolean castrado) {
		super(especie, peso);
		this.castrado = castrado;
	}
	

	@Override
	public String EmitirSom(String som) {
		return "miau";
	}


	public Boolean getCastrado() {
		return castrado;
	}


	public void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}


	@Override
	public String toString() {
		return "gato [castrado=" + castrado + "]";
	}	
	
}
