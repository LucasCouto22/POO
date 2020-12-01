

public class Porta{

    String cor;
    boolean estaAberta = false;
    float largura;
    float altura;


    public void set_cor(String cor){
        this.cor = cor;
    }
    public void set_estaAberta(boolean estaAberta){
        this.estaAberta = estaAberta;
    }
    public void set_largura(float largura){
        this.largura = largura;
    }
    public void set_altura(float altura){
        this.altura = altura;
    }
    public String get_cor(){
        return this.cor;
    }
    public float get_altura(){
        return this.altura;
    }
    public float get_largura(){
        return this.largura;
    }

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
