public class Circulo extends Geometria{
    float raio;
    final double  PI = 3.14;
    
    public void Circulo(){

    }
    public void Circulo(float raio){
        this.raio = raio;
    }

    public double area(float raio){
        this.area = (float) (raio * raio * PI);
        return this.area;
    }

}