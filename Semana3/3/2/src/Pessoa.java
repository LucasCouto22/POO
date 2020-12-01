public class Pessoa{

    String nome;
    int idade;


    void fazerAniversario(){
        idade ++;
    }


    public void set_nome(String nome){
        this.nome = nome;
    }
    public String get_nome(){
        return this.nome;
    }
    public void set_idade(int idade){
        this.idade = idade;
    }
    public int get_idade(){
        return this.idade;
    }
}