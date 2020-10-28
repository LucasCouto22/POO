public class Retangulo extends Geometria{
    float lado_maior;
    float lado_menor;
    public void Retangulo(){

    }
    
    public void Retangulo(float lado_maior, float lado_menor){
        this.lado_maior = lado_maior;
        this.lado_menor = lado_menor;
    }


    public float area(float lado_maior, float lado_menor){
        this.area = lado_maior * lado_menor;
        return this.area;
    }
}