package POO;

public class CirculoApplication {

	public static void main(String[] args) {

		Circulo q1 = new Circulo();
		Circulo q2 = new Circulo();
		Circulo q3 = new Circulo();
		Circulo q4 = new Circulo();
		
		q1.raio = 4;
		q2.raio = 5;
		q3.raio = 33;
		q4.raio = 12;
		
		System.out.println(q1.obterArea());
		System.out.println(q2.obterArea());
		System.out.println(q3.obterArea());
		System.out.println(q4.obterArea());
	}

}