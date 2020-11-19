public class TesteContaCorrente {
    public static void main(String[] args){
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(100);
        conta.setValorLimite(1000);
        try{
            conta.sacar(150);
        }catch(IllegalArgumentException err){
            System.out.println(err.getMessage());
        }
        try{
            conta.depositar(-10);
        }catch(IllegalArgumentException err){
            System.out.println(err.getMessage());
        }
        try{
            conta.setValorLimite(-1000);
        }catch(IllegalArgumentException err){
            System.out.println(err.getMessage());
        }
        System.out.println("Finalizando o program");
    }

}
