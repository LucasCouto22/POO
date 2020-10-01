public class Main{

    public static void main (String[] args){

        Conta contaCorrente = new Conta();
        
        contaCorrente.nome = "Lucas";
        contaCorrente.numero = "1032";
        contaCorrente.agencia = "32423";
        contaCorrente.saldo = 10000f;

        System.out.println("Nome: "+ contaCorrente.nome);
        System.out.println("Numero da conta: "+ contaCorrente.numero);
        System.out.println("Agencia da conta: "+ contaCorrente.agencia);
        System.out.println("Saldo atual: "+ contaCorrente.saldo);
        System.out.println("\n");

        contaCorrente.calculaRendimento();

        System.out.println("Depois do rendimento: ");
        System.out.println("Nome: "+ contaCorrente.nome);
        System.out.println("Numero da conta: "+ contaCorrente.numero);
        System.out.println("Agencia da conta: "+ contaCorrente.agencia);
        System.out.println("Saldo atual: "+ contaCorrente.saldo);
        System.out.println("\n");

        contaCorrente.sacar(500.20f);

        System.out.println("Depois de sacar: ");
        System.out.println("Nome: "+ contaCorrente.nome);
        System.out.println("Numero da conta: "+ contaCorrente.numero);
        System.out.println("Agencia da conta: "+ contaCorrente.agencia);
        System.out.println("Saldo atual: "+ contaCorrente.saldo);
        System.out.println("\n");

        contaCorrente.depositar(2000.20f);

        System.out.println("Depois de depositar: ");
        System.out.println("Nome: "+ contaCorrente.nome);
        System.out.println("Numero da conta: "+ contaCorrente.numero);
        System.out.println("Agencia da conta: "+ contaCorrente.agencia);
        System.out.println("Saldo atual: "+ contaCorrente.saldo);
        System.out.println("\n");

    }

}