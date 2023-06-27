public class AplicacaoTestaPoli {
    
    public static void main(String[] args) {
        
        //Poligono poli = new Poligono(); // Nao pode ser instanciado, pois eh Interface
        
        //Triangulo tri = new Triangulo(2.0f, 3.0f); // Nao pode ser instanciado, pois eh Classe Abstrata
        
        TrianguloEquilatero triEq = new TrianguloEquilatero(2.0f, 2.0f, 2.0f);
        triEq.imprimeTipoPoligono();
        System.out.println("Area: " + triEq.calculaArea() + "\n");
        
        TrianguloIsosceles triIs = new TrianguloIsosceles(12.0f, 10.0f, 10.0f);
        triIs.imprimeTipoPoligono();
        System.out.println("Area: " + triIs.calculaArea() + "\n");
        
        System.out.println("Triangulo Qualquer");
        System.out.println("Area: " + Triangulo.calculaArea(5.0f, 10.0f));
        
    }
}