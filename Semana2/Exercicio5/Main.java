public class Main{

    public static void main (String[] args){

        Portas porta1 = new Portas();
        Portas porta2 = new Portas();
        Portas porta3 = new Portas();
        Portas statusPortas = new Portas();
        Casa casa = new Casa();
        
        casa.cor = "Verde";
        porta3.nomePorta = "porta3";
        porta2.nomePorta = "porta2";
        porta1.nomePorta = "porta1";
        statusPortas.nomePorta = "status";


        casa.mudaCor("Vermelho");
        System.out.println("Cor da casa agora: "+ casa.cor);

        porta1.abrirPorta();
        porta2.abrirPorta();

        statusPortas.quantasPortasEstaoAbertas();

        casa.mudaCor("Azul");
        System.out.println("Cor da casa agora: "+ casa.cor);

        porta1.fecharPorta();
        porta2.fecharPorta();
        porta3.abrirPorta();
        porta1.abrirPorta();
        porta2.abrirPorta();
        

        statusPortas.quantasPortasEstaoAbertas();

    }

}