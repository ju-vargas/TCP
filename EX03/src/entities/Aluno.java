//package entities;


public class Aluno {

	private int numeroMatricula;
	private int indiceDesempenho;
	
	public Aluno(){
		numeroMatricula = 0; 
		indiceDesempenho = 0; 
	}
	
	public Aluno(int numeroMatricula, int indiceDesempenho){
		this.numeroMatricula = numeroMatricula;
		this.indiceDesempenho = indiceDesempenho;
	}

	public void aumentaIndiceDesempenho() {
		this.indiceDesempenho++; 
	}

	public void diminuiIndiceDesempenho() {
		this.indiceDesempenho--; 
	}
	
	public int getNumeroMatricula() {
		return this.numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula; 
	}

	public int getIndiceDesempenho() {
		return this.indiceDesempenho; 
	}

	public void setIndiceDesempenho(int indiceDesempenho) {
		this.indiceDesempenho = indiceDesempenho;
	}
	
	public void imprime() {
	
	}

}
