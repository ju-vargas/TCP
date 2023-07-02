package poligonos;
 
public abstract class TrianguloEquilatero extends Triangulo {
    // float lado;

    public TrianguloEquilatero(float ladoA, float ladoB, float ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
	public float calculaArea() {
		return (float) (Math.sqrt(3)*(this.ladoA * this.ladoA))/4;
    }

    @Override
    public void imprimeTipoPoligono(){
        System.out.println("Poligono: Triangulo equilatero");
    }
}

3
