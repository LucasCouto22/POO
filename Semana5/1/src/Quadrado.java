public class Quadrado extends Retangulo{

    @Override 
    public void calcularArea(float lado){
        this.area = lado * lado;
    }

    @Override
    public void calcularPerimetro(float lado) {
        this.perimetro = 4 * lado;
    }
    
}
