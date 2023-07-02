package poligonos;

public abstract class Triangulo implements Poligono {

	private float ladoA;
	private float ladoB;
	private float ladoC;
	private float base;
	private float altura;


    //construtores nao possuem tipo void/int etc etc
    //polimorfismo estático é essa declaração com parametros diferentes
	public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
	}

	public Triangulo(float ladoA, float ladoB, float ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC; 
	}

	public static float calculaArea(float base, float altura) {
        return (base * altura)/2;
	}

	public float calculaArea() {
        return (this.base * this.altura)/2; 
	}

    //metodos abstratos NAO possuem corpo
	public abstract void imprimeTipoPoligono();


    //getters e setters
    public float getLadoA() {
        return ladoA;
    }
    
    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }
    
    public float getLadoB() {
        return ladoB;
    }
    
    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }
    
    public float getLadoC() {
        return ladoC;
    }
    
    public void setLadoC(float ladoC) {
        this.ladoC = ladoC;
    }
    
    public float getBase() {
        return base;
    }
    
    public void setBase(float base) {
        this.base = base;
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    } 
}
