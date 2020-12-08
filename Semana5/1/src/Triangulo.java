public class Triangulo extends FormaGeometrica {
    public void calcularArea(float base, float altura){
        this.area = (base * altura) / 2;
    }

    public void calcularPerimetro(float lado1, float lado2, float lado3){
        this.perimetro = lado1 + lado2 + lado3;
    }
}
