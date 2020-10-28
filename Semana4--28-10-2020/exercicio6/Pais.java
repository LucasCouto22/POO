import java.util.ArrayList;

public class Pais{
    String nome;
    String capital;
    ArrayList<Pais> fonteiras = new ArrayList<Pais>();
    double km2;

    public void Pais(){

    }
    public void Pais(String nome){
        this.nome = nome;
    }
    public void Pais(String nome, String capital){
        this.nome = nome;
        this.capital = capital;
    }
    public void Pais(String nome, String capital, double km2){
        this.nome = nome;
        this.capital = capital;
        this.km2 = km2;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCapital(String capital){
        this.capital = capital;
    }
    public void setKm2(double km2){
        this.km2 = km2;
    }
    public String setNome(){
        return this.nome;
    }
    public String setCapital(){
        return this.capital;
    }
    public double setKm2(){
        return this.km2;
    }
    public void setFronteiras(Pais pais){
        if(equals(pais)){
            return;
        }else{
        this.fonteiras.add(pais);
        }
    }
    public ArrayList<Pais> getFronteiras(){
        return this.fonteiras;
    }
    public boolean equals(Pais outro){
        if(outro.capital == this.capital && outro.nome == this.nome){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Pais>fronteiras(Pais pais){
        ArrayList<Pais>auxiliar = new ArrayList<Pais>();
        for(Pais fronteiras : pais.getFronteiras()){
            if(this.fonteiras.contains(fronteiras) && !auxiliar.contains(fronteiras)){
                auxiliar.add(fronteiras);
            }
        }
        return auxiliar;
        
    }
}