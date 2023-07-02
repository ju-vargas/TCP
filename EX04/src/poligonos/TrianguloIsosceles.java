package poligonos;

public class TrianguloIsosceles extends Triangulo {
        // float ladoA;
        // float ladoB;
        // float ladoC; 
        // float altura;
        // float base; 
    

    public TrianguloIsosceles(float ladoA, float ladoB, float ladoC) {
        super(ladoA, ladoB, ladoC);
    }

	public float calculaArea() {
        this.altura = calculaAltura();
		return super.calculaArea(this.base, this.altura);
    }

    @Override
    public void imprimeTipoPoligono(){
        System.out.println("Poligono: Triangulo isosceles");
    }


    public float calculaAltura(){
        if (this.ladoA == this.ladoB){
            this.base = this.ladoC; 
            return (float) Math.sqrt(Math.pow(ladoA, 2) - Math.pow(this.base/2, 2));
        }
        
        else if (this.ladoA == this.ladoC){
            this.base = this.ladoB;
            return (float) Math.sqrt(Math.pow(ladoA, 2) - Math.pow(this.base/2, 2));

        }
        else{
            this.base = this.ladoA; 
            return (float) Math.sqrt(Math.pow(ladoB, 2) - Math.pow(this.base/2, 2));

        }



    }

}


