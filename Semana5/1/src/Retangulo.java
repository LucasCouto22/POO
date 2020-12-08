public class Retangulo extends FormaGeometrica{
    public void calcularArea(float lado1, float lado2){
        this.area = lado1 * lado2;
    }
    public void calcularArea(float lado){
        this.area = lado * lado;
    }

    public void calcularPerimetro(float lado1, float lado2){
        this.perimetro = (2 *lado1) + (2 * lado2);
    }

    public void calcularPerimetro(float lado){
        this.perimetro = 4 * lado;
    }
}