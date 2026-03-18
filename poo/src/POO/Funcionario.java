package POO;

public class Funcionario {
	
	String identificacao;
	String nome;
	String sobreNome;
	double salario ;
	
	public double SalAnual() {
		return salario * 12;
	}
	
	public String nomeCompleto() {
		return nome + " " + sobreNome;
	}
	
	public void  ModSalario(double percentual) {
		
		double aumento = salario * (percentual / 100);
		salario = salario + aumento;
	}
}