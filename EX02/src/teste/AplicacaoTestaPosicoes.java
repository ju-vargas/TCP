package teste;
import java.util.Scanner;

import posicoes.PosicaoMapa4x4;

import java.util.ArrayList; 

public class AplicacaoTestaPosicoes {
    private static int MAP_WIDTH = 4;
    private static int MAP_HEIGHT = 4;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x,y; 
        boolean isValid; 

        PosicaoMapa4x4 p1 = new PosicaoMapa4x4(); 
        System.out.println("Dados para o ponto P1: ");
        do{
            System.out.print("Insira o valor de x:");
            x = scanner.nextInt();

            System.out.print("Insira o valor de y:");
            y = scanner.nextInt();

            isValid = p1.setX(x) && p1.setY(y); 
        } while (!isValid); 
        System.out.print("Imprimindo ponto p1: ");
        p1.imprime();
        System.out.println();
         

        PosicaoMapa4x4 p2 = new PosicaoMapa4x4(); 
        System.out.println("Dados para o ponto P2: ");
        do{
            System.out.print("Insira o valor de x:");
            x = scanner.nextInt();

            System.out.print("Insira o valor de y:");
            y = scanner.nextInt();

        
            isValid = p2.setX(x) && p2.setY(y); 
        } while (!isValid);   
        System.out.print("Imprimindo ponto p2: ");
        p2.imprime();
        System.out.println();
        
        System.out.println("Distancia entre pontos p1 e p2 = " + p1.distancia(p2));

        PosicaoMapa4x4 p3 = p1.copy(); 
        
        System.out.println((PosicaoMapa4x4.estaoMesmaPosicao(p1, p2)) ? "": "Estão na mesma posição: (p1,p2)"); 
        System.out.println((PosicaoMapa4x4.estaoMesmaPosicao(p2, p3)) ? "": "Estão na mesma posição:(p1,p2)"); 
        System.out.println((PosicaoMapa4x4.estaoMesmaPosicao(p1, p2)) ? "": "Estão na mesma posição:(p1,p3)"); 

        ArrayList<PosicaoMapa4x4> positionList = new ArrayList<PosicaoMapa4x4>();
        positionList.add(p1);
        positionList.add(p2);
        positionList.add(p3);
        
        imprimeMapa(positionList);

        scanner.close(); 
    }
    
    private static void imprimeMapa(ArrayList<PosicaoMapa4x4> dronesList){
        boolean isPositionTaken; 

        //x eh coluna
        //---- j tambem
        //y eh linha
        //---- i tambem
        for (int i = 0; i < MAP_HEIGHT;i++){
            for(int j = MAP_WIDTH; j > 0;j--){
                System.out.printf("[");  
                isPositionTaken = false; 
                for(PosicaoMapa4x4 position: dronesList) {
                    if(position.getX() == j && position.getY() == i && !isPositionTaken){
                        System.out.printf(" X "); 
                        isPositionTaken = true;  
                    } 
                }
                System.out.printf((isPositionTaken ? "": "   "));
                System.out.printf("]");
            }
            System.out.println(); 
        }
    }

}