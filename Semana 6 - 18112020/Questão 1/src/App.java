// IllegalArgumentException só acontece dentro de um método, se for passada por um argumento ilegal ou formato inapropriado
// NumberFormatException só acontece quando ocorre a tentativa de conversão de string para número, pois a string não possui o formato correto 

public class App {
    public static String concatenar(String primeira, String segunda){
        if(primeira == null){
            
            throw new IllegalArgumentException("A string da primeira variavel não pode ser nula!");
            
        }
        if(segunda == null){
            
            throw new IllegalArgumentException("A segunda variável String não pode ser nula!");
        }
        
        return primeira + segunda;

    }


    public static void main(String[] args){
        
        String primeira = "123";
        String segunda = "Teste";
        Integer tereceira;
        
        try{
            
            App.concatenar(primeira, null);
            
        }
        catch(IllegalArgumentException err){
            
            System.out.println("Foi passado um argumento ilegal!");
            System.out.println(err.getMessage());
            
        }
        try{
            
            terceira = Integer.parseInt(segunda);
            
        }
        catch(NumberFormatException err){
            
            System.out.println("Não pode ser feita a conversão, uma conversão ilegal foi feita!");
            System.out.println(err.getMessage());
            
        }
        
        System.out.println("Exemplo!");
        
    }
    
}
