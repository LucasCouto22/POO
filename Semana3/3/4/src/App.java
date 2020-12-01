public class App {
    public static void main(String[] args){
        Porta porta = new Porta();
        porta.cor = "Amarela";
        porta.altura = 200;
        porta.largura = 75;
        if(porta.estaAberta){
            System.out.println("A porta esta aberta");
        }else{
            System.out.println("A porta esta fechada");
        }

        porta.abre();
        if(porta.estaAberta){
            System.out.println("A porta esta aberta");
        }else{
            System.out.println("A porta esta fechada");
        }
        porta.fecha();

        porta.cor = "Azul";
        porta.largura = 100;
        porta.altura = 250;
    }
}
