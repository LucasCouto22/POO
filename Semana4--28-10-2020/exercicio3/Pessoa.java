public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai = new Pessoa();
    private Pessoa mae = new Pessoa();

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public Pessoa getPai(){
        return this.pai;
    }
    public Pessoa getMae(){
        return this.mae;
    }
    
}