public class PessoaFisica extends Pessoa{
    String aniversario;


    

    public void setCpf(String cpf){
        this.documento = cpf;
    }

    public String getCpf(){
        return this.documento;
    }

    public void setAniversario(String aniversario){
        this.aniversario = aniversario;
    }

    public String getAniversario(){
        return this.aniversario;
    }
}