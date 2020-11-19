// A exceção IllegalArgumentException é levantada quando, dentro de um método, for passado um argumento ilegal ou com formato inapropriado
// A exceção do tipo NumberFormatException é levantada quando, numa tentativa de conversão de string para um numero, apresentar que a string não possuir o formato correto
public class App {
    public static String concatenar(String a, String b){
        if(a == null){
            throw new IllegalArgumentException("A primeira string não pode ser nula");
        }
        if(b == null){
            throw new IllegalArgumentException("A segunda string não pode ser nula");
        }
        return a + b;

    }


    public static void main(String[] args){
        String a = "123";
        String b = "Teste";
        Integer c;
        try{
            App.concatenar(a, null);
        }
        catch(IllegalArgumentException err){
            System.out.println("Um argumento ilegal foi passado");
            System.out.println(err.getMessage());
        }
        try{
            c = Integer.parseInt(b);
        }
        catch(NumberFormatException err){
            System.out.println("Uma conversão ilegal de String para Inteiro foi feita");
            System.out.println(err.getMessage());
        }
        System.out.println("Um exemplo de codigo importante");
    }
}
