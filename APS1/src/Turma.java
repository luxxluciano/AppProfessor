
public class Turma extends Aluno {

	
	private String disciplina;
	private Aluno turma[] = new Aluno[5];
	
	
	
// GETTER E SETTER	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public Aluno[] getTurma() {
		return turma;
	}
	public void setTurma(Aluno turma[]) {
		this.turma = turma;
	}
	public Turma(String disciplina, Aluno[] turma) {
		super(disciplina, matricula);
		this.disciplina = disciplina;
		this.turma = turma;
	}
	
	
	
	
	
}
