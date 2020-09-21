import java.util.Scanner;

class Exercicio3{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int valor;
        int soma = 1;

        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();

        for(int i = valor; i >= 1; --i){
            soma = soma * i;
        }

        System.out.println("Valor do fatorial de "+ valor + " e : " + soma);
    }
}