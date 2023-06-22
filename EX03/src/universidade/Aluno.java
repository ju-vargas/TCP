package universidade;


public class Aluno {
	private int numeroMatricula;
	private float indiceDesempenho;
	
	public Aluno(){
		numeroMatricula = 0; 
		indiceDesempenho = 0; 
	}
	
	public Aluno(int numeroMatricula, float indiceDesempenho){
		this.numeroMatricula = numeroMatricula;
		this.indiceDesempenho = indiceDesempenho;
	}

	public void aumentaIndiceDesempenho(float valueInc) {
		this.indiceDesempenho = this.indiceDesempenho + valueInc; 
	}

	public void diminuiIndiceDesempenho(float valueDec) {
		this.indiceDesempenho = this.indiceDesempenho - valueDec; 
	}
	
	public int getNumeroMatricula() {
		return this.numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula; 
	}

	public float getIndiceDesempenho() {
		return this.indiceDesempenho; 
	}

	public void setIndiceDesempenho(int indiceDesempenho) {
		this.indiceDesempenho = indiceDesempenho;
	}
	
	public void imprime() {
		System.out.println("Matricula: " + this.getNumeroMatricula()); 
		System.out.println("Desempenho: " + this.getIndiceDesempenho()); 
	}

}
