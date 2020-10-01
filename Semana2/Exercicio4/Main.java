public class Main{

    public static void main (String[] args){

        Portas porta = new Portas();
        
        porta.altura = 2.10f;
        porta.largura = 0.80f;
        porta.cor = "vermelho";
        porta.situacaoPorta = 1;

        porta.estaAberta();

        porta.mudaCor("verde");

        porta.fecharPorta();
        porta.estaAberta();
        System.out.println("Cor da porta: "+ porta.cor);

        porta.mudaCor("azul");
        porta.abrirPorta();
        porta.estaAberta();
        System.out.println("Cor da porta: "+ porta.cor);

    }

}