import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int metadePrimeira = num/2;
        Primos numerosPrimos = new Primos(2, metadePrimeira);
        Primos primosNumeros = new Primos(metadePrimeira + 1, num);
        numerosPrimos.start();
        primosNumeros.start();
        
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
