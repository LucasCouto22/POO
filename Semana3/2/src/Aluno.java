public class Aluno{ 

    float nota1;
    float nota2;
    float nota;
    int notas;
    float media;
    ArrayList<String> historico = new ArrayList();

    public float nota(float nota){
        this.nota = this.nota + nota;
        this.notas = this.notas + 1;
        return this.nota;
    }

    public float media(){
        this.media = this.nota / this.notas;
        return this.media;
    }

    public String historico(){
        return this.historico;
    }   

    public String cr(){

        float notaTotal;
        int contador;
        float notaFim;

        for(int i : this.historico) {  
            
            notaTotal = notaTotal + this.historico[i];
            contador = contador + 1;
        }  

        notaFim = notaTotal / contador;

        return notaFim; 
    }

}
