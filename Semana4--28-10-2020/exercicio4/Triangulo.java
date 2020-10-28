public class Triangulo extends Geometria{
    float altura;
    float base;

    public void Triangulo(){

    }

    public void Triangulo(float altura, float base){
        this.altura = altura;
        this.base = base;
    }


    public double area(float altura, float base){
        this.area = ((altura * base) / 2);
        return this.area;
    }
    
}