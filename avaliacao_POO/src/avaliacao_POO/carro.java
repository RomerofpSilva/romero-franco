package avaliacao_POO;

import java.time.LocalDate;

public class carro {

	private String marca;
	private String modelo;
	private String placa;
	private LocalDate ano;
	private double preco;
	private LocalDate dataDeAquisicao;
	
	
	public carro(String marca, String modelo, String placa, LocalDate ano, double preco, LocalDate dataDeAquisicao) {
		setMarca(marca);
		setModelo(modelo);
		setPlaca(placa);
		setAno(ano);
		setPreco(preco);
		setDataDeAquisicao(dataDeAquisicao);
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		if(marca == null || marca.isBlank()) {
			throw new IllegalArgumentException("Marca invalida");
		}
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		if(modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Marca invalida");
		}
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		if(placa == null || placa.isBlank()) {
			throw new IllegalArgumentException("Marca invalida");
		}
		this.placa = placa;
	}


	public LocalDate getAno() {
		return ano;
	}

	/*não coloquei o getYear

	 */

	public void setAno(LocalDate ano) {
		if(ano == null || ano.isAfter(LocalDate.now().getYear())) {
			throw new IllegalArgumentException("Marca invalida");
		}
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		if(preco <= 0) {
			throw new IllegalArgumentException("Marca invalida");
		}
		this.preco = preco;
	}


	public LocalDate getDataDeAquisicao() {
		return dataDeAquisicao;
	}


	public void setDataDeAquisicao(LocalDate dataDeAquisicao) {
		if(dataDeAquisicao == null || dataDeAquisicao.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Marca invalida");
		}
		this.dataDeAquisicao = dataDeAquisicao;
	}


	@Override
	public String toString() {
		return "carro [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", preco=" + preco
				+ "]";
	}
	
	
}
