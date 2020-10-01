public class Lampada{

    boolean acesa = false;
    boolean meiaLuz = false;
    boolean apagada = true;

    boolean estaLigada(){
        if(acesa || meiaLuz){
            return true;
        }else{
            return false;
        }
    }
    
}