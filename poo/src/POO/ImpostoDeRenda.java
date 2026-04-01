package POO;

public class ImpostoDeRenda {

	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;

	public ImpostoDeRenda(String nome, String cpf, String uf, double rendaAnual) {
		setNome(nome);
		setCpf(cpf);
		setUf(uf);
		setRendaAnual(rendaAnual);
	}

	public double calcularImposto() {
		if (rendaAnual <= 4000) {
			return 0;
		} else if (rendaAnual >= 4001 && rendaAnual <= 9000) {
			return 0.058 * rendaAnual;
		} else if (rendaAnual >= 9001 && rendaAnual <= 25000) {
			return 0.15 * rendaAnual;
		} else if (rendaAnual >= 25001 && rendaAnual <= 35000) {
			return 0.275 * rendaAnual;
		} else {
			return 0.3 * rendaAnual;
		}
	}

	@Override
	public String toString() {
		return "ImpostoDeRenda [nome=" + nome + ", CPF=" + cpf + ", UF=" + uf + ", rendaAnual=" + rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		} else {
			this.nome = nome;
		}

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf == null || cpf.isBlank()) {
			System.out.println("Erouu, CPF invalido");
		} else {
			this.cpf = cpf;
		}
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf == null || uf.length() != 2) {
			System.out.println("Erro, uf invalido");
		} else {
			this.uf = uf;
		}
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual < 0) {
			System.out.println("Erro, renda anual invalida");
		} else {
			this.rendaAnual = rendaAnual;
		}

	}

}
//NOME, CPF, UF (RS,PR e SC) e RENDA ANUAL.