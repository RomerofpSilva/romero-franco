import java.util.ArrayList;
import java.util.List;


public class Retangulo {
	
		private List<Retangulo> listaRetangulos;

		public Retangulo() {
			listaRetangulos = new ArrayList<>();
			
		public void adicionarRetangulo(Retangulo r) {
			listaRetangulo.add(r);
		}
		public List<Retangulo> obterLista() {
			return listaRetangulos;
		}
			
		public Retangulo obterRetanguloMaiorPerimetro() {
			double maiorPerimetro = Double.MIN_VALUE;
			Retangulo retMaiorPerimetro = null;
			for (Retangulo r : listaRetangulos) {
				if (r.obterPerimetro() > maiorPerimetro) {
					maiorPerimetro = r.obterPerimetro();
					retMaiorPerimetro = r;
				}
			}

			return retMaiorPerimetro;
		}
			
		public Retangulo obterRetanguloMaiorArea() {
			double maiorArea = Double.MIN_VALUE;
			Retangulo retMaiorArea = null;

			for (Retangulo r : listaRetangulos) {
				if (r.obterArea() > maiorArea) {
					maiorArea = r.obterArea();
					retMaiorArea = r;
				}
			}

			return retMaiorArea;
			
	}
}
