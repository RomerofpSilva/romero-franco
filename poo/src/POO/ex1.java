package POO;

public class ex1 {

	public static void main(String[] args) {
		
		ex1c p1 = new ex1c();
		
		p1.pessoa = "Eduardo";
		p1.sexo = 'F';
		p1.data = "01/01/1500";
		p1.estadoCivil = "Solteiro";
		
		System.out.println("O seu nome é: " + p1.pessoa);
		
ex1c p2 = new ex1c();
		
		p2.pessoa = "Yuri";
		p2.sexo = 'M';
		p2.data = "19/09/2006";
		p2.estadoCivil = "Casado";
		
		System.out.println("O seu nome é: " + p2.pessoa);
		

	}

}
