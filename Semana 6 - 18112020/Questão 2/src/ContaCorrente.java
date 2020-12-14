public class ContaCorrente {
    
    
    float limite = 0;
    float saldo = 0;
    float valorDeLimite = 0;
    


    public void sacar(float valor){
        
        if(valor <= 0){
            
            throw new IllegalArgumentException("Você não pode sacar um valor negativo!");
            
        }
        if(valor > this.saldo){
            
            throw new IllegalArgumentException("Você não pode sacar um valor maior que o seu saldo!");
            
        }
        
        this.saldo = this.saldo - valor;
        
    }

    public void depositar(float valor){
        
        if(valor <=0){
            
            throw new IllegalArgumentException("Você não pode depositar um valor nulo ou negativo!");
        }
        
        this.saldo = this.saldo + valor;
    }

    public void setValorLimite(float valorDeLimite){
        
        if(valorDeLimite < 0){
            
            throw new IllegalArgumentException("O valor do limite não pode ser negativo!");
            
        }
        
        this.valorDeLimite = valorDeLimite;
    }
}
