import java.time.LocalDate;

public class JavaBooks {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Clean Code", "Robert C. Martin", "9780132350884", LocalDate.of(2008, 10, 5), 210, LocalDate.of(2026, 2, 4));
		Livro l2 = new Livro("Effective Java", "Joshua Bloch", "JKM97801346859919B12", LocalDate.of(2018, 3, 9), 380, LocalDate.of(2026, 5, 9));
		Livro l3 = new Livro("Head First JavaScript", "Eric Freeman", "9780321125217", LocalDate.of(2014, 1, 18), 340, LocalDate.of(2026, 2, 11));
		Livro l4 = new Livro("Java Concurrency in Practice", "Brian Goetz", "9780321349606", LocalDate.of(2006, 6, 22), 79, LocalDate.of(2026, 3, 10));
		Livro l5 = new Livro("Head First Design Patterns", "Eric Freeman", "9780596007126", LocalDate.of(2014, 5, 20), 79, LocalDate.of(2026, 3, 24));
		
		Livraria LI = new Livraria();
			
		LI.adicionarLivro(l1);
		LI.adicionarLivro(l2);
		LI.adicionarLivro(l3);
		LI.adicionarLivro(l4);
		LI.adicionarLivro(l5);
		
		
		

	}

}
