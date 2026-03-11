package POO;

public class ex1Class {

	public static void main(String[] args) {
		
		classEx1 p1 = new classEx1();
		
		p1.pessoa = "Eduardo";
		p1.sexo = 'F';
		p1.data = "01/01/1500";
		p1.estadoCivil = "Solteiro";
		
		System.out.println("O seu nome é: " + p1.pessoa);
		
classEx1 p2 = new classEx1();
		
		p2.pessoa = "Yuri";
		p2.sexo = 'M';
		p2.data = "19/09/2006";
		p2.estadoCivil = "Casado";
		
		System.out.println("O seu nome é: " + p2.pessoa);
		

	}

}
