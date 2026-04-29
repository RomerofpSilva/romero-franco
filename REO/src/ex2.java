
public class ex2 {

	public static void main(String[] args) {
		
		Flor f1 = new Flor("Margarida", 10, "Ana");
		Flor f2 = new Flor("Rosa", 30, "Ana");
		Flor f3 = new Flor("Tulipa", 10, "Henrique");
		Flor f4 = new Flor("Cannabis", 100, "Turma de DESI 2025/2");
		Flor f5 = new Flor("Girassol", 15, "Gabriel");
	
		Floricultura floricultura = new Floricultura();
		
		floricultura.adicionarFlor(f1);
		floricultura.adicionarFlor(f2);
		floricultura.adicionarFlor(f3);
		floricultura.adicionarFlor(f4);
		floricultura.adicionarFlor(f5);
		
		System.out.println(floricultura.obterFloresPorCliente("Gabriel"));
			
	}

}
