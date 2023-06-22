package universidade;
import java.util.ArrayList;



public class Turma {
    private static int MIN_ALUNOS = 5;
    private static int MAX_ALUNOS = 35;
	private static int MAX_MONITORES = 3;

	private int numAlunos;
	private int numMonitores;
	private Professor professor;
	private ArrayList<Monitor> monitores;
	private ArrayList<Aluno> alunos;


	public Turma(){
		this.numAlunos = 0;
		this.numMonitores = 0;
		this.monitores = new ArrayList<Monitor>();
		this.alunos = new ArrayList<Aluno>();
		this.professor = new Professor(); 
	}

	public Turma(Professor professor, ArrayList<Monitor> monitoresList, ArrayList<Aluno> alunosList){
		
		if(alunosList.size() < MIN_ALUNOS || alunosList.size() > MAX_ALUNOS) {
			System.out.println("Numero de alunos deve estar entre 5 e 35! A entrada " + numAlunos + " eh invalida!");
		}
		else if (monitoresList.size() > MAX_MONITORES) {
			System.out.println("Numero de monitores nao deve ser maior que 3! A entrada " + numMonitores + " eh invalida!");
		}
		else {
			this.numAlunos = alunosList.size();
			this.numMonitores = monitoresList.size();
			this.professor = professor;
			this.monitores.clear();
			this.alunos.clear();
		}
	}

	//turma entre 5 e 35 alunos	
	public boolean adicionaAluno(Aluno aluno) {
		if(numAlunos == MAX_ALUNOS) {
			System.out.println("Numero de alunos nao pode exceder maximo."); 
			return false; 
		}
		alunos.add(aluno);
		numAlunos++;
		
		return true; 
	}

	//minimo 5 alunos
	public boolean removeAluno() {
		if (numAlunos == MIN_ALUNOS) {
			System.out.println("Numero de alunos nao pode ser inferior ao numero minimo."); 
			return false;
		}

		this.alunos.remove(numAlunos-1); 

		numAlunos --; 
		
		return true; 
	}

	public void imprimeAlunos() {
		for (Aluno aluno:alunos){
			System.out.println("Matricula: " + aluno.getNumeroMatricula()); 
			System.out.println("Desempenho: " + aluno.getIndiceDesempenho()); 
		}
		System.out.println();
	}

	public int getNumAlunos() {
		return this.numAlunos;
	}

	//entre 5 e 35 
	public boolean setAlunos(ArrayList<Aluno> alunos) {
		if(alunos.size() < MIN_ALUNOS || alunos.size() > MAX_ALUNOS) {
			System.out.println("Numero de alunos deve estar entre minimo e maximo! A entrada " + alunos.size() + " eh invalida!");
			return false; 
		}
		this.alunos = alunos; 
		return true;
	}


	public Professor getProfessor() {
		return this.professor; 
	}

	//define nome professor
	public boolean setProfessor(Professor professor) {
		this.professor = professor; 
		return true; 
	}


	public ArrayList<Monitor> getMonitores() {
		return monitores; 
	}

	public boolean setMonitores(ArrayList<Monitor> monitores) {
		if (monitores.size() == MAX_MONITORES) {
			System.out.println("Numero de monitores deve ser no maximo 3");
			return false; 
		}
		else{
			this.monitores = monitores; 
			numMonitores = monitores.size();
		}
		return true; 
	}

	public int getNumMonitores(){
		return this.numMonitores; 
	}
}
