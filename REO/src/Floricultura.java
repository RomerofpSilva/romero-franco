import java.util.ArrayList;
import java.util.List;

public class Floricultura {

	private List<Flor> listaFlores;
	
	public Floricultura() {
		listaFlores = new ArrayList<Flor>();
	}
	
	public void adicionarFlor(Flor f) {
		listaFlores.add(f);
	}

	public List<Flor> obterListaFlores() {
		return listaFlores;
	}
	
	public List<Flor> obterFloresPorCliente(String nome) {
		
		List<Flor> listaFlorPorCliente = new ArrayList<Flor>();
		for (Flor f : listaFlores) {
			if (f.getNomeCliente().equalsIgnoreCase(nome)) {
				listaFlorPorCliente.add(f);
			}
		}
		
		return listaFlorPorCliente;
		
	}
}
