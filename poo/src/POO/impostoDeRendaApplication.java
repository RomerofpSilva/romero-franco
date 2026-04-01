package POO;

public class impostoDeRendaApplication {

	public static void main(String[] args) {

		ImpostoDeRenda pessoa1 = new ImpostoDeRenda("Pedro", "12345678910", "SC", 4000);
		ImpostoDeRenda pessoa2 = new ImpostoDeRenda("Eduardo", "01987654321", "SC", 8000);
		ImpostoDeRenda pessoa3 = new ImpostoDeRenda("kauan", "20210600001", "SC", 16000);
		ImpostoDeRenda pessoa4 = new ImpostoDeRenda("Rony", "20240200002", "SC", 32000);
		ImpostoDeRenda pessoa5 = new ImpostoDeRenda("Yuri", "77777777747", "SC", 64000);

		ImpostoDeRenda listaPessoa[] = { pessoa1, pessoa2, pessoa3, pessoa4, pessoa5 };

		double maiorRendaAnual = Integer.MIN_VALUE;
		ImpostoDeRenda contribuinteMaiorRendaAnual = null;

		for (int i = 0; i < listaPessoa.length; i++) {
			if (listaPessoa[i].calcularImposto() > maiorRendaAnual) {
				maiorRendaAnual = listaPessoa[i].calcularImposto();
				contribuinteMaiorRendaAnual = listaPessoa[i];
			}
		}

		System.out.println(contribuinteMaiorRendaAnual);

		double totalImpostoArrecadado = 0;

		for (int i = 0; i < listaPessoa.length; i++) {
			totalImpostoArrecadado += listaPessoa[i].calcularImposto();
		}

		System.out.println(totalImpostoArrecadado);

	}

}
