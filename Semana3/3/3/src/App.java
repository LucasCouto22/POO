public class App {
    public static void main(String[] args){
        Banco conta = new Banco();
        conta.nomeTitular = "Arthur Pinheiro";
        conta.numeroConta = 12345;
        conta.agencia = 7654;
        conta.saldo = 134.50;
        conta.dataAbertura = "14/01/2018";

        System.out.println(conta.saldo);
        conta.deposita(35.30);
        System.out.println(conta.saldo);
        conta.saca(73.20);
        System.out.println(conta.saldo);
        System.out.println(conta.rendimento());


    }
}
