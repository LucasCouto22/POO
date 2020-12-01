public class App {
    public static void main(String[] args){
        Casa casa = new Casa();
        for(int i = 0; i <3; i++){
            casa.portas[i] = new Porta();
        }
        casa.pintarCasa("Verde");
        casa.portas[1].abre();
        casa.portas[0].abre();
        casa.portas[1].fecha();
        casa.portas[2].abre();

        System.out.println(casa.cor);
        System.out.println(casa.quantasPortasEstaoAbertas());
    }
}
