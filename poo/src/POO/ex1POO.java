package POO;

public class ex1POO {

	public static void main(String[] args) {
	
		Veiculo v1 = new Veiculo();
		
		v1.modelo = "Honda City";
		v1.comprimento = 4.2;
		v1.passageiros = 5;
		v1.velMax = 190;
		v1.cor = "Vermelho";
		
		Veiculo v2 = new Veiculo();
		
		v2.modelo = "Monark";
		v2.comprimento = 1.70;
		v2.passageiros = 1;
		v2.velMax = 30;
		v2.cor = "Vermelho";
		
		if (v1.velMax > v2.velMax) {
			System.out.println("O " + v1.modelo + " é mais rápido");
		}else {
			System.out.println("O " + v2.modelo + " é mais rápido");
		}

	}

}
