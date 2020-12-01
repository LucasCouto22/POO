public class Casa{
    String cor;
    Porta[] portas = new Porta[3];

    void pintarCasa(String valor){
        cor = valor;
    }

    int quantasPortasEstaoAbertas(){
        int aux = 0;
        for(int i = 0; i <3; i++){
            if(portas[i].estaAberta()){
                aux++;
            }
        }
        return aux;
    }
}