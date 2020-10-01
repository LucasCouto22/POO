public class Portas {

    float altura;
    int situacaoPorta;
    float largura;
    String cor;

    void estaAberta(){

        if (situacaoPorta == 1)
            System.out.println("A porta esta aberta!");
        else{
            System.out.println("A porta esta fechada!");
        }

    }

    void abrirPorta(){

        if (situacaoPorta == 1)
            situacaoPorta = 1;
        else{
            situacaoPorta = 2;
        }

    }

    void fecharPorta(){

        if (situacaoPorta == 1)
            situacaoPorta = 2;
        else{
            situacaoPorta = 2;
        }

    }

    void mudaCor(String corNova){

        cor = corNova;

    }

}