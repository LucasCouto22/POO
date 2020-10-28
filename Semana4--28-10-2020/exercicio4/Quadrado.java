public class Quadrado extends Geometria {
    float lado;

    public void Quadrado(){

    }

    public void Quadrado(float lado){
        this.lado = lado;
    }

    public double area(float lado){
        this.area = lado * lado;
        return this.area;
    }
    
}