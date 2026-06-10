package avaliacao_POO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class revendedora {

	private List<carro> ListaCarros;
	
	public revendedora() {
		ListaCarros = new ArrayList<carro>();
	}
	
	public List<carro> obterCarro(String placa){
		
		List<carro> listaPesquisaCarros = new ArrayList<carro>();
		
/*		for (carro a : ListaCarros) {
		if(a.getPlaca().equals(placa)) {
			return a;
						}
		return null;
		}*/ /*<--- lugar errado*/
	}
	
	/* pulei o adicionar carro
	 * 
	 * public void adicionarCarro(carro c){
	 * 	listaCarros.add(c);
	 * 
	 * }
	 * 
	 * public carro obterCarroPlaca(String placa){
	 * 		for(carro c : listaCarros){
	 * 			if(c.getPlaca().equals(placa)){
	 * 				return c ;
	 * }
	 * 
	 * }
	 * 		
	 * 		return null;
	 * 
	 * }
	 * 
	 */
	/* coloquei null no maior valor
	 * 
	 * 		
	 * 
	 * 
	 * 
	 * 
		public obterValorMaior(double preco) {
			
			carro MaiorValor = 0;
			LocalDate DeterminadoAno = LocalDate.now();
			
			for(carro v : ListaCarros) {
				
				if (v.getDataDeAquisicao().isBefore(DeterminadoAno)) {
					DeterminadoAno = v.getDataDeAquisicao();
					MaiorValor = v;
				}
			}

			return MaiorValor;

			} 
			
			*		tudo errado ^
			*
			*/
		
			
	}
}
