public class Circulo extends FormaGeometrica {

   public void calcularArea(float raio) {
	    this.area = raio * raio * 3;
	
    }

    public void calcularPerimetro(float raio) {
        this.perimetro = 6 *raio;

    }
}
