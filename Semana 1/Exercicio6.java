import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class Exercicio6{

    public static void main(String[] args){

        Random random = new Random();
        int[] vetor1 = new int[50];
        int[] vetor2 = new int[50];
        int[] vetorfinal = new int[100];

        for(int i = 0; i < 50; i++){
            vetor1[i] = random.nextInt(100);
            vetor2[i] = random.nextInt(100);           
        }

        Arrays.sort(vetor1);
        Arrays.sort(vetor2);
        int a = 0;
        int b = 0;
        int c = 0;

        while(c < 100){
            if(a == 50){
                for(; b < 50; b++){
                    vetorfinal[c] = vetor2[b];
                    c++;
                }
            }
            else if(b == 50){
                for(; a < 50; a++){
                    vetorfinal[c] = vetor1[a];
                    c++;
                }
            }
            else if(vetor1[a] < vetor2[b]){
                vetorfinal[c] = vetor1[a];
                a++;
                c++;
            }
            else if(vetor2[b] < vetor1[a]){
                vetorfinal[c] = vetor2[b];
                b++;
                c++;
            }
            else {
                vetorfinal[c] = vetor1[a];
                vetorfinal[c + 1] = vetor2[b];
                c += 2;
                a++;
                b++;
            }
        }
        for(int t = 0; t < 99; t++){
            System.out.println(vetorfinal[t]);
        }
    }
}