public class Portas {

    int contaPorta;
    String nomePorta;

    void quantasPortasEstaoAbertas(){

        System.out.println("Quantas portas estao abertas: "+ contaPorta);

    }

    void abrirPorta(){

        if (contaPorta < 3)
            contaPorta = contaPorta + 1;
        else{
            System.out.println("Todas as portas ja estao abertas.");
        }
    }

    void fecharPorta(){

        if (contaPorta > 0)
            contaPorta = contaPorta - 1;
        else{
            System.out.println("Todas as portas já estao fechadas.");
        }

    }


}