package poligonos;

public class TrianguloIsosceles extends Triangulo {
    public TrianguloIsosceles(float ladoA, float ladoB, float ladoC) {
        super(ladoA, ladoB, ladoC);
    }

	public float calculaArea() {
        float altura = calculaAltura();
        float base = super.getBase();
		return super.calculaArea(base, altura);
    }

    @Override
    public void imprimeTipoPoligono(){
        System.out.println("Poligono: Triangulo isosceles");
    }


    public float calculaAltura(){
        //ta certo isso?  
        float ladoA = super.getLadoA();
        float ladoB = super.getLadoB();
        float ladoC = super.getLadoC();


        if (ladoA == ladoB){
            super.setBase(ladoC); 
            return (float)Math.sqrt(Math.pow(ladoA, 2) - Math.pow(ladoC/2, 2));
        }
        
        else if (ladoA == ladoC){
            super.setBase(ladoB); 
            return (float) Math.sqrt(Math.pow(ladoA, 2) - Math.pow(ladoB/2, 2));

        }
        else{
            super.setBase(ladoA); 
            return (float) Math.sqrt(Math.pow(ladoB, 2) - Math.pow(ladoA/2, 2));

        }
    }

}


