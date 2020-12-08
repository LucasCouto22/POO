import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.next();
        ArrayList<String> array = new ArrayList<String>();
        for(String palavra : frase.split(";")){
            array.add(palavra);
        }
        Map<String,Integer> mapPalavras = new HashMap<String,Integer>();
    
        for(String palavra : array){
            Integer freq = mapPalavras.get(palavra);

            if(freq != null){
                mapPalavras.put(palavra, freq+1);
            }else {
                mapPalavras.put(palavra,1);
			}
        }

        teclado.close();
        for (Map.Entry<String, Integer> entry : mapPalavras.entrySet()) {
            System.out.println(entry.getKey() + "\tfreq=" + entry.getValue());
         }
    }

}