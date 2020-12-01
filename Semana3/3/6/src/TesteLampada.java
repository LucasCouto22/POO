public class TesteLampada {
    public static void main(String[] args){
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();
        lampada1.acesa = true;

        if(lampada1.estaLigada()){
            System.out.println("Lampada 1 esta ligada");
        }else{
            System.out.println("Lampada 1 esta desligada");
        }

        if(lampada2.estaLigada()){
            System.out.println("Lampada 2 esta ligada");
        }else{
            System.out.println("Lampada 2 esta desligada");
        }
    }
}
