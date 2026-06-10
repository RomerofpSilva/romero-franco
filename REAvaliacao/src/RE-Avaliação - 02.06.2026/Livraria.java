
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livraria {

	private List<Livro> ListaLivros;
	
	public Livraria() {
		ListaLivros = new ArrayList<Livro>();
	}
	

	// Todos os livros de um determinado autor, cujo preço esteja entre um intervalo de X e Y (claramente esta errado"eu acho")
	public List<Livro> listarCarrosMarcaEPreco(String autor, double precoMinimo, double precoMaximo) {

		List<Livro> listaLivrosAutorPreco = new ArrayList<Livro>();

		for (Livro l : ListaLivros) {
			if (l.getAutor().equals(autor) && (l.getPreco() >= precoMinimo && l.getPreco() <= precoMaximo)) {
				listaLivrosAutorPreco.add(l);
			}
		}

		return listaLivrosAutorPreco;
	}

	//Um livro a partir de seu ISBN, retornando null caso o livro não exista (não sei se deu certo)
	public Livro obterLivro(String isbn) {
		if(isbn == null || isbn.isBlank()) {
			throw new IllegalArgumentException("ISBN INVALIDO");
		}
		
		for(Livro l : ListaLivros) {
			if(l.getIsbn().equals(isbn)) {
				return l;
			}
			
		}
		return null;
	}
		
	//O livro mais caro de um determinado ano de publicação (tentei)
	public Livro obterLivroMaisCaroAno(LocalDate dataDePublicacao) {

		Livro LivroMaisCaro = null;
		double maisCaro = 0;

		for (Livro l : ListaLivros) {
			if (l.getDataDePublicacao() == dataDePublicacao && l.getPreco() > maisCaro) {
				maisCaro = l.getPreco();
				LivroMaisCaro = l;
			}

		}

		return LivroMaisCaro;
	}
		
	public void adicionarLivro(Livro l) {
		ListaLivros.add(l);
	}
	
	public List<Livro> getList() {
		return this.ListaLivros;
	}
	
}
