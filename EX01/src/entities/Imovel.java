package entities;

public class Imovel {
    public int nQuartos;
    public int nBanheiros;
    public boolean temGaragem;
    public String endereco;
    public boolean aluguel;
    public double valorVenda;

    public void imprimeDados(){
        System.out.println("\n");
        System.out.println("Nro de quartos: " + this.nQuartos);
        System.out.println("Nro de banheiros: " + this.nBanheiros);
        System.out.println("Tem garagem? " + (this.temGaragem ? "Sim" : "Nao" )); 
        System.out.println("Aluguel? " + (this.aluguel ? "Sim" : "Nao" )); 
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Valor de venda: " + this.valorVenda);
        System.out.println();
    };
    public double calculaImposto(){
        double imposto;
        imposto = (this.aluguel ? 0.10*this.valorVenda : 0.15*this.valorVenda ); 
        return imposto; 
    };
    public void valoriza(double perc){
        this.valorVenda = this.valorVenda + (this.valorVenda*(perc/100));
    };
};

