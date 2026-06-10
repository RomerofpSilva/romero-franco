package avaliacao_POO;

public class pesquisaCarroDTO {

	private String placa;

	public pesquisaCarroDTO(String placa) {
		setPlaca(placa);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if(placa == null || placa.isBlank()) {
			throw new IllegalArgumentException("Placa invalida");
		}
		
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "pesquisaCarroDTO [placa=" + placa + "]";
	}
	
	
	
	
}
