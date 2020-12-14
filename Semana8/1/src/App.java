import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	
    public static void main(String[] args) throws Exception {
	    
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        ArrayList<String> array = new ArrayList<String>();
	    
        for(String termo : frase.split(";")){
            array.add(termo);
        }
	    
        Map<String,Integer> mapTermo = new HashMap<String,Integer>();
    
        for(String termo : array){
		
            Integer freq = mapTermo.get(termo);

            if(freq != null){
                mapTermo.put(termo, freq+1);
            }else {
                mapTermo.put(termo,1);
	    }
        }

        teclado.close();
        for (Map.Entry<String, Integer> entry : mapTermo.entrySet()) {
            System.out.println(entry.getKey() + "\tfreq=" + entry.getValue());
         }
    }

}
