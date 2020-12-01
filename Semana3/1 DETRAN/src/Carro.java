public class Carro{
    String montadora;
    String modelo;
    String cor;
    String placa;
    String nomeDono;
    String endereçoDono;
    
    


    void trocarDono(String novoDono){
        this.nomeDono = novoDono;
    }

    void trocarCor(String novaCor){
        this.cor = novaCor;
    }

    void trocarEndereço(String novoEndereço){
        this.endereçoDono = novoEndereço;
    }
}