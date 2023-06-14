package teste;
import posicoes.PosicaoMapa4x4;
import java.util.Scanner;
import java.util.ArrayList; 

public class AplicacaoTestaPosicoes {

    private static int MAP_WIDTH = 4;
    private static int MAP_HEIGHT = 4;
    
    public static void main(String[] args) {
        int x,y; 
        boolean isValid; 

        PosicaoMapa4x4 p1 = new PosicaoMapa4x4(); 
        do{
            Scanner scanner = new Scanner(System.in);

            System.out.print("Insira o valor de x:");
            x = scanner.nextInt();

            System.out.print("Insira o valor de y:");
            y = scanner.nextInt();
            scanner.close(); 

            isValid = p1.setX(x) && p1.setY(y); 
        } while (!isValid); 

        p1.imprime();
         
        
        PosicaoMapa4x4 p2 = new PosicaoMapa4x4(); 
        do{
            Scanner scanner = new Scanner(System.in);

            System.out.print("Insira o valor de x:");
            x = scanner.nextInt();

            System.out.print("Insira o valor de y:");
            y = scanner.nextInt();
            scanner.close(); 

            isValid = p2.setX(x) && p2.setY(y); 
        } while (!isValid); 
        
        p2.imprime();
    
        System.out.println("Distancia entre pontos p1 e p2 = " + p1.distancia(p2));


        PosicaoMapa4x4 p3 = p1.copy(); 
        
        System.out.print((PosicaoMapa4x4.estaoMesmaPosicao(p1, p2)) ? "": "(p1,p2)"); 
        System.out.print((PosicaoMapa4x4.estaoMesmaPosicao(p2, p3)) ? "": "(p1,p2)"); 
        System.out.print((PosicaoMapa4x4.estaoMesmaPosicao(p1, p2)) ? "": "(p1,p3)"); 

        //PosicaoMapa4x4.estaoMesmaPosicao(p2, p3); 
        //PosicaoMapa4x4.estaoMesmaPosicao(p1, p3); 


        ArrayList<PosicaoMapa4x4> positionList = new ArrayList<PosicaoMapa4x4>();
        positionList.add(p1);
        positionList.add(p2);
        positionList.add(p3);
        
    
        imprimeMapa(positionList);
    }
    
    private static void imprimeMapa(ArrayList<PosicaoMapa4x4> dronesList){
        boolean isPositionTaken; 

        //x eh coluna
        //---- j tambem
        //y eh linha
        //---- i tambem
        for (int i = 0; i < MAP_HEIGHT;i++){
            for(int j = 0; j < MAP_WIDTH;i++){
            System.out.println("[");  

            isPositionTaken = false; 
            for(PosicaoMapa4x4 position: dronesList) {
                if(position.getX() == j && position.getY() == i){
                    System.out.println(" X "); 
                    isPositionTaken = true;  
                } 
            }

            System.out.println((isPositionTaken ? "": "   "));
            System.out.println("]");
            }

        }

    }

}