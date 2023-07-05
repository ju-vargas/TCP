package poligonos;
 
public class TrianguloEquilatero extends Triangulo {

    public TrianguloEquilatero(float ladoA, float ladoB, float ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
	public float calculaArea() {
        float ladoA = super.getLadoA();
		return (float) (Math.sqrt(3)*(ladoA*ladoA))/4;
    }

    @Override
    public void imprimeTipoPoligono(){
        System.out.println("Poligono: Triangulo equilatero");
    }
}

