
import java.time.LocalDate;

public class Livro {

	private String titulo;
	private String autor;
	private String isbn;
	private LocalDate DataDePublicacao;
	private double preco;
	private LocalDate dataDeEmprestimo;
	
	
	public Livro(String titulo, String autor, String isbn, LocalDate dataDePublicacao, double preco, LocalDate dataDeEmprestimo) {
		setTitulo(titulo);
		setAutor(autor);
		setIsbn(isbn);
		setDataDePublicacao(dataDePublicacao);
		setPreco(preco);
		setDataDeEmprestimo(dataDeEmprestimo);
	}


	
	public double calcularMulta(int tempoMulta) {

		if (tempoMulta <= LocalDate.now().getMonthValue()) {
			
		}

		int meses = tempoMulta - LocalDate.now().getMonthValue();
		
		taxa = definirTaxa();

		return preco * Math.pow(1 - taxa, meses);

	}
	
	private double definirTaxa() {
		
		if (dataDeEmprestimo >= 01/02) {
			return 0.1;
		}
		return 0.1;
		
	}
	
	
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		if(titulo == null || titulo.isBlank()) {
		throw new IllegalArgumentException("Titulo invalido");
		}
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		if(autor == null || autor.isBlank()) {
			throw new IllegalArgumentException("Autor invalido");
			}
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		if(isbn == null || isbn.isBlank()) {
			throw new IllegalArgumentException("ISBN invalido");
			}
	}


	public LocalDate getDataDePublicacao() {
		return DataDePublicacao;
	}


	public void setDataDePublicacao(LocalDate dataDePublicacao) {
		if(dataDePublicacao.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data de publicação invalida");
		}
		
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		if(preco <= 0 ) {
			throw new IllegalArgumentException("Preço invalido");
			}
	}


	public LocalDate getDataDeEmprestimo() {
		return dataDeEmprestimo;
	}


	public void setDataDeEmprestimo(LocalDate dataDeEmprestimo) {
		if(dataDeEmprestimo.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data de empréstimo invalida");
		}
	}


	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", DataDePublicacao="
				+ DataDePublicacao + ", preco=" + preco + ", dataDeEmprestimo=" + dataDeEmprestimo + "]";
	}
	
	
	
}
