
import java.util.ArrayList;
import java.util.List;

public class MateriaisConstrucoes {

	private List<Produto> listaProdutos;
	
	public MateriaisConstrucoes() {
		listaProdutos = new ArrayList<>();
	}
	
	public void adicionarProduto(Produto p) {
		listaProdutos.add(p);
	}
	
}
