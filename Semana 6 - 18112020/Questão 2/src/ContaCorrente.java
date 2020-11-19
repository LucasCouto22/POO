public class ContaCorrente {
    float limite = 0;
    float saldo = 0;
    float valorLimite = 0;
    


    public void sacar(float valor){
        if(valor <=0){
            throw new IllegalArgumentException("Impossivel sacar um valor negativo ou nulo");
        }
        if(valor > this.saldo){
            throw new IllegalArgumentException("Impossivel sacar um valor maior que o saldo");
        }
        this.saldo = this.saldo - valor;
    }

    public void depositar(float valor){
        if(valor <=0){
            throw new IllegalArgumentException("Impossivel depositar um valor negativo ou nulo");
        }
        this.saldo = this.saldo + valor;
    }

    public void setValorLimite(float valorLimite){
        if(valorLimite < 0){
            throw new IllegalArgumentException("Impossivel o valor limite ser negativo");
        }
        this.valorLimite = valorLimite;
    }
}
