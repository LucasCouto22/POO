import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Termo a");
        arraylist.add("Termo b");
        arraylist.add("Termo c");
        arraylist.add("Termo d");
        arraylist.add("Termo e");
        System.out.println("Um Array List:");
        System.out.println(arraylist.toString());
        
        HashSet<String> hashset = new HashSet<String>(arraylist);
        System.out.println("Um HashSet:");
        System.out.println(hashset.toString());
        
        PriorityQueue<String> priorityqueue = new PriorityQueue<String>(hashset);
        System.out.println("Um PriorityQueue: ");
        System.out.println(priorityqueue.toString());
        
        ArrayDeque<String> arraydeque = new ArrayDeque<String>(priorityqueue);
        System.out.println("Um ArrayDeque: ");
        System.out.println(arraydeque.toString());
        
        TreeSet<String> treeset = new TreeSet<String>(arraydeque);
        System.out.println("Um TreeSet: ");
        System.out.println(treeset.toString());
        
    }
    
}

// As diferenças estão na forma em que se armazenam os dados. Como vimos na disciplina Estrutura de Dados, existem diversas formas de se armazenar um dado, cada uma tem o seu propósito onde se torna melhor. 
