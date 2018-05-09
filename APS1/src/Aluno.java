
public class Aluno implements Faltas {
	
		private static String nome;
		protected static int matricula;
		private static int numFaltas;
		private static Faltas falta;
	
		
//		getters e setters
		
		public String getNome() {
			return nome;
		}

		public static void setNome(String nome) {
			Aluno.nome = nome;
		}

		public int getMatricula() {
			return matricula;
		}

		public static void setMatricula(int matricula) {
			Aluno.matricula = matricula;
		}

		public static Faltas getFalta() {
			return falta;
		}

		public static void setFalta(Faltas falta) {
			Aluno.falta = falta;
		}

		public static int getNumFaltas() {
			return numFaltas;
		}

		public static void setNumFaltas(int numFaltas) {
			Aluno.numFaltas = numFaltas;
		}

		//		Constructor
		public Aluno(String nomes, int i) {
			
		}

}
