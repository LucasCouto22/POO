public class Banco {
    String nomeTitular;
    int numeroConta;
    int agencia;
    double saldo;
    String dataAbertura;

    public void set_nomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    public void set_numeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public void set_agencia(int agencia){
        this.agencia = agencia;
    }
    public void set_saldo(double saldo){
        this.saldo = saldo;
    }
    public void set_dataAbertura(String dataAbertura){
        this.dataAbertura = dataAbertura;
    }

    public String get_nomeTitular(){
        return this.nomeTitular;
    }
    public int get_numeroConta(){
        return this.numeroConta;
    }
    public int get_agencia(){
        return this.agencia;
    }
    public double get_saldo(){
        return this.saldo;
    }
    public String get_dataAbertura(){
        return this.dataAbertura;
    }


    void deposita(double valor){
        saldo = saldo + valor;
    }
    

    void saca(double valor){
        saldo = saldo - valor;
    }

    double rendimento(){
        return saldo*0.1;
    }
}
