import java.util.Scanner;

class Exercicio4{

    public static void main(String[] args){

        int fibonacci = 0;
        int aux1 = 0;
        int aux2 = 1;
        int interacao = 3;

        System.out.println("Valor apos a interacao 1 : " + aux1);
        System.out.println("Valor apos a interacao 2 : " + aux2);

        while (fibonacci < 102){
            fibonacci = aux1 + aux2;
            aux1 = aux2;
            aux2 = fibonacci;
            System.out.println("Valor apos a interacao " + interacao + " : " + fibonacci);
            interacao += 1;
        }

        System.out.println("Valor final : " + fibonacci);
    }
}