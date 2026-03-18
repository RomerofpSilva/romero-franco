package POO;

public class FuncionarioApplication {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.identificacao = "2";
		f1.nome = "Roberto";
		f1.sobreNome = "Jeremias";
		f1.salario = 2.56;
		
		
		System.out.println(f1.SalAnual());
		System.out.println(f1.nomeCompleto());
		f1.ModSalario(10);
		System.out.println(f1.SalAnual());
		System.out.println(f1.salario);

	}

}
