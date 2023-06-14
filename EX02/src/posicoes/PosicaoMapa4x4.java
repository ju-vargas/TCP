package posicoes;
import java.lang.Math;

public class PosicaoMapa4x4 {

    public int x;
    public int y;
    private static int numPosicoesOcupadas;

    public PosicaoMapa4x4(){
        reset();
    }

    public PosicaoMapa4x4(int x, int y){
        this.x = x;
        this.y = y;
        reset();
    }

    public boolean setX(int x){
        boolean isSuccess = false; 
        
        if(x >= 0 && x < 4){
            this.x = x; 
            isSuccess = true; 
        }
        else{
            reset();
        }
        return isSuccess; 
    }

    public boolean setY(int y){
        boolean isSuccess = false; 
        if(y >= 0 && y < 4){
            this.y = y; 
            isSuccess = true; 
        }
        else{
            reset();
        }
        return isSuccess;     
    }

    public int getY(){
        return this.y;
    }

    public int getX(){
        return this.x;
    }

    public static int getNumPosicoesOcupadas() {
        return numPosicoesOcupadas; 
    }

    public PosicaoMapa4x4 copy(){
        PosicaoMapa4x4 newObject = new PosicaoMapa4x4(this.x, this.y); 
        return newObject; 
    }

    public void imprime(){
        System.out.println("(" + this.x + "," + this.y + ")");

    }

    public int distancia (PosicaoMapa4x4 p){
        int manhattanDistance; 
        manhattanDistance = Math.abs((p.getX() - this.x)  + (p.getY() - this.y));
        return manhattanDistance; 
    }

    private void reset(){
        this.x = 0;
        this.y = 0; 
    }

    public static boolean estaoMesmaPosicao(PosicaoMapa4x4 p1, PosicaoMapa4x4 p2){
        boolean isSamePosition = false; 

        if ((p1.getX() == p2.getX()) && p1.getY() == p2.getY()){
            isSamePosition = true; 
        }

        return isSamePosition;
    }

}
