package universidade; 

public class Monitor {

	private int semestreAtual;
	private boolean temExperiencia;

	public Monitor(){
		this.semestreAtual = 0;
		this.temExperiencia = false;
	}

	public Monitor(int semestreAtual, boolean temExperiencia){
		this.semestreAtual = semestreAtual;
		this.temExperiencia = temExperiencia;
	}

	public int getSemestre() {
		return this.semestreAtual;
	}

	public void setSemestre(int semestreAtual) {
		this.semestreAtual = semestreAtual;
	}

	public boolean getExperiencia() {
		return this.temExperiencia; 
	}

	public void setExperiencia(boolean temExperiencia) {
		this.temExperiencia = temExperiencia;
	}

}
