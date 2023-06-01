import entities.Imovel;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        Imovel im1; // declaracao do objeto
        im1 = new Imovel(); // instanciacao do objeto
        im1.nQuartos = 2;
        im1.nBanheiros = 1;
        im1.temGaragem = false;
        im1.endereco = "Rua dos Fulanos, n. 0";
        im1.aluguel = true;
        im1.valorVenda = 142000;

        im1.imprimeDados();
        im1.valoriza(2.5);
        im1.imprimeDados();
        System.out.println("Imposto: " + im1.calculaImposto());
    
    
        //PARTE 5
        Imovel im2; // declaracao do objeto
        im2 = new Imovel(); // instanciacao do objeto
        im2.nQuartos = 2;
        im2.nBanheiros = 1;
        im2.temGaragem = false;
        im2.endereco = "Rua dos Fulanos, n. 0";
        im2.aluguel = true;
        im2.valorVenda = 142000;

        System.out.println("\n");
        if (im1 == im2){
            System.out.println("Mesmos imoveis!");
        }
        else{
            System.out.println("Imoveis distintos!");
        }

        /*
        Por quê? 
        Instanciei um novo objeto, Im1 e Im2 estão apontando para lugares diferentes
        */

        //PARTE 5

        Imovel im3 = im1;
        im3.valorVenda = 0; // imovel com perda total
        im3.imprimeDados();
        im1.imprimeDados();
        /*
        Por quê? 
        Estou passando o "endereco", e agora Im3 aponta pra Im1
        */
    }
}
