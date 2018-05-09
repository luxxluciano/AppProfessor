import java.util.*;

/*-- Faça uma aplicaçõo que 
 * crie automaticamente uma turma com 5 alunos e permita ao usuário
			realizar chamadas,
			adicionar avaliações (até 3) e
			verificar a média dos alunos.
-- */

public class AppProfessor {

	public static int index = 1;
	public static Aula aulas[] = new Aula[index];
	public static Turma turma = new Turma(null, null);
	
	public static void main(String[] args) {

		criaTurma(); 
		while(true) menu();
		
	}//--fecha main	

	
//	----------	MENU  -------------
	private static void menu() {
		String str = "\n-----------------";
		str += "\nMENU";
		str += "\n-----------------";
		str += "\n1- Chamada Turma"; // Lista as turma para Chamada;
		str += "\n2- Adiciona Avaliaçõo"; // Lista as turmas do professor para Cadasatro de avaliações;
		str += "\n3- Lista Alunos"; // Lista geral de alunos com as presenças e avaliações;
		str += "\n-----------------";
		str += "\nEscolha: ";

		int resp = Integer.parseInt(teclado(str));

		switch(resp){
			case 1: chamadaTurma();		break;
//			case 2: avaliaTurma();		break;
			case 3: listaAlunos();		break;
	
		}//--fecha switch
	}//--fecha menu
			


//-------------	CRIA TURMA -------------

	@SuppressWarnings("static-access")
	private static Aluno[] criaTurma() {
			
		Aluno tempAluno[] = new Aluno[5];
		
		turma.setDisciplina(teclado("Digite o nome da disciplina: "));
			
			for (int i=0; i<tempAluno.length; i++) {
				if (tempAluno[i] !=null) {
					System.out.println("Não há mais vagas nesta turma!");
				}
				else {	
				tempAluno[i].setNome(teclado("Digite o nome do aluno: "));
				tempAluno[i].setMatricula(i + 1);
				}//fecha else"
				
			}//fecha for		
			return tempAluno;
	
			
	}//fecha criaTurma();
	
//------------- CHAMADA TURMA ----------------	
	
	private static void chamadaTurma() {
		
		for (int i=0; i<aulas.length; i++) {
				if (aulas[i] != null) {
					index++;
				}
	
				else {
					aulas[i] = new Aula();
					aulas[i].setDia(new Date());
					aulas[i].setNumAula(index);
				
				}
		}
		
		System.out.println();
//		listaAlunos();
			
	}//fecha chamadaTurma();
	

	private static void listaAlunos() {
				
		for (int i=0; i<turma.getTurma().length; i++) {
		
			System.out.println ("A turma de " + turma.getDisciplina() + " tem os seguintes alunos: \n"
					+ "[mat num: " + turma.getTurma()[i].getMatricula() + "] - " 
					+ turma.getTurma()[i].getNome());
		}
	}		
		
		

		

	
	
	
	
	
		
	
	



	//				TECLADO
	@SuppressWarnings("resource")
	private static String teclado(String str) {
		System.out.println(str);
		return new Scanner(System.in).next();
	}

	
}
