

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
    public void set_acesa(){
        this.acesa = true;
        this.meiaLuz = false;
        this.apagada = false;
    }
    public void set_meiaLuz(){
        this.acesa = false;
        this.meiaLuz = true;
        this.apagada = false;
    }
    public void set_apagada(){
        this.acesa = false;
        this.meiaLuz = false;
        this.apagada = true;
    }
}