public class Conta {

    String nome;
    String numero;
    String agencia;
    float saldo;



    void sacar(float saque){

        saldo = saldo - saque;

    }

    void depositar(float deposito){

        saldo = saldo + deposito;

    }

    void calculaRendimento(){

        saldo = saldo * 1.01f;

    }

}