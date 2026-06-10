
import java.util.ArrayList;
import java.util.List;

public class SistemaDeAlunos {

	private List<Aluno> listaAlunos;

	public SistemaDeAlunos() {
		listaAlunos = new ArrayList<Aluno>();
	}

	public List<Aluno> obterAlunos(String curso, int idade, double mediaFinal) {

		List<Aluno> listaPesquisaAlunos = new ArrayList<Aluno>();

		for (Aluno a : listaAlunos) {
			if (a.getCurso().equalsIgnoreCase(curso) && a.getIdade() >= idade && a.getMediaFinal() >= mediaFinal) {
				listaPesquisaAlunos.add(a);
			}
		}

		return listaPesquisaAlunos;
	}

	public Aluno obterAluno(String matricula) {
		for (Aluno a : listaAlunos) {
			if (a.getMatricula().equals(matricula)) {
				return a;
			}
		}
		return null;
	}

	public void adicionarAluno(Aluno a) {
		listaAlunos.add(a);
	}

	public List<Aluno> obterListaAlunos() {
		return listaAlunos;
	}
}
