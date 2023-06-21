//package entities;

import java.util.ArrayList;


public class Turma {

	private int numAlunos;
	private int numMonitores;
	private String professor;
	private ArrayList monitores;
	private ArrayList alunos;


	public Turma(){
		this.numAlunos = 0;
		this.numMonitores = 0;
		this.professor = "";
		this.monitores.clear();
		this.alunos.clear();
	}

	public Turma(int numAlunos, int numMonitores, String professor){
		this.numAlunos = numAlunos;
		this.numMonitores = numMonitores;
		this.professor = "";
		this.monitores.clear();
		this.alunos.clear();
	}
	public boolean adicionaAluno() {

	}

	public boolean removeAluno() {

	}

	public void imprimeAlunos() {

	}

	public int getNumAlunos() {

	}

	public boolean setNumAlunos() {

	}

	public int getProfessor() {

	}

	public boolean setProfessor() {

	}

	public ArrayList<Monitor> getMonitores() {

	}

	public boolean setMonitores() {

	}

	public ArrayList<Aluno> getAlunos() {

	}

	public boolean setAlunos() {

	}

}
