public class PessoaJuridica extends Pessoa{
    String faturamento;

    public void setRazaoSocial(String razaoSocial){
        this.nome = razaoSocial;
    }

    public String getRazaoSocial(){
        return this.nome;
    }

    public void setCnpj(String cnpj){
        this.documento = cnpj;
    }

    public String getCnpj(){
        return this.documento;
    }

    public void setFaturamento(String faturamento){
        this.faturamento = faturamento;
    }

    public String getFaturamento(){
        return this.faturamento;
    }
}