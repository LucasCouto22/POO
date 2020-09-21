import java.util.Scanner;

class Exercicio5{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int valor;
        int interacao = 1;

        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();

        while (valor != 1){
            if (valor % 2 == 0)
                valor = valor / 2;
            else{
                valor = 3 * valor + 1;
            }               
            System.out.println("Valor apos a interacao " + interacao + " : " + valor);
            interacao += 1;
        }

    }
}