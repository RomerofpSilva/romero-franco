package POO;

public class CirculoApplication {

	public static void main(String[] args) {

		Circulo q1 = new Circulo();
		
		q1.largura = 2;
		q1.raio = 4;
		
		System.out.println(q1.obterArea());
		
	}

}
