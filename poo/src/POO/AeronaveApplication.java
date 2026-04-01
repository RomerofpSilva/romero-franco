package POO;

public class AeronaveApplication {

	public static void main(String[] args) {

		Aeronave aeronave1 = new Aeronave("1", 100, 1200, 220000, 50);
		Aeronave aeronave2 = new Aeronave("2", 200, 1500, 200000, 47);
		Aeronave aeronave3 = new Aeronave("3", 300, 1000, 250000, 78);
		Aeronave aeronave4 = new Aeronave("4", 150, 1300, 210000, 53);
		
		aeronave1 = 

		Aeronave ListaAeronave[] = { aeronave1, aeronave2, aeronave3, aeronave4 };

		int maiorPassgeiros = Integer.MIN_VALUE;
		Aeronave maiorNPassageiros = null;

		for (int i = 0; i < ListaAeronave.length; i++) {
			if (ListaAeronave[i].passageiros > maiorPassgeiros) {
				maiorPassgeiros = ListaAeronave[i].passageiros;
				maiorNPassageiros = ListaAeronave[i];
			}
		}

		System.out.println("As aeronaves que mais transporta passageiros: " + maiorNPassageiros);

		// B

		double maiorTempo = Integer.MIN_VALUE;
		Aeronave maiorDuracaoNoAr = null;

		for (int i = 0; i < ListaAeronave.length; i++) {
			if (ListaAeronave[i].ObterTempoNoAr() > maiorTempo) {
				maiorTempo = ListaAeronave[i].ObterTempoNoAr();
				maiorDuracaoNoAr = ListaAeronave[i];
			}
		}

		System.out.println("\nA maeronave que mais fica tempo no ar  é: " + maiorDuracaoNoAr);

		// C

		double maisLonge = Integer.MIN_VALUE;
		Aeronave maiorDistanciaPercorrida = null;

		for (int i = 0; i < ListaAeronave.length; i++) {
			if (ListaAeronave[i].ObterMaisDistancia() > maisLonge) {
				maisLonge = ListaAeronave[i].ObterMaisDistancia();
				maiorDistanciaPercorrida = ListaAeronave[i];
			}
		}

		System.out.println("\nO avião que mais voa longe é: " + maiorDistanciaPercorrida);

	}
}
