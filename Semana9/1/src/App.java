import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int metadeInferior = num/2;
        Primos numerosPrimos = new Primos(2, metadeInferior);
        Primos primosNumeros = new Primos(metadeInferior + 1, num);
        primos.start();
        primos2.start();
        
        try{
            
            numerosPrimos.join();
            
        }catch(InterruptedException err){
            
            err.printStackTrace();
            
        }
        try{
            
            primosNumeros.join();
            
        }catch(InterruptedException err){
            
            err.printStackTrace();
            
        }
        
        int quant = 0;
        quant = numerosPrimos.getQuantidade() + primosNumeros.getQuantidade();
        System.out.println(quant);
        teclado.close();
        
    }
    
}
