

public class Porta{

    String cor = "Branco";
    boolean estaAberta = false;
    float largura = 200;
    float altura = 75;


    void abre(){
        estaAberta = true;
    }

    void fecha(){
        estaAberta = false;
    }

    boolean estaAberta(){
        if(estaAberta){
            return true;
        }else{
            return false;
        }
    }
}
