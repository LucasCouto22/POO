import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Linha1");
        arraylist.add("linha2");
        arraylist.add("linha3");
        arraylist.add("linha4");
        arraylist.add("linha5");
        System.out.println("Array List");
        System.out.println(arraylist.toString());
        HashSet<String> hashset = new HashSet<String>(arraylist);
        System.out.println("Hash Set");
        System.out.println(hashset.toString());
        PriorityQueue<String> priorityqueue = new PriorityQueue<String>(hashset);
        System.out.println("Priority Queue");
        System.out.println(priorityqueue.toString());
        ArrayDeque<String> arraydeque = new ArrayDeque<String>(priorityqueue);
        System.out.println("Array Deque");
        System.out.println(arraydeque.toString());
        TreeSet<String> treeset = new TreeSet<String>(arraydeque);
        System.out.println("Tree Set");
        System.out.println(treeset.toString());
        // As diferenças nas ordens se da pelas diferentes maneiras de armazenar os dados. Cada classe se utiliza de uma tecnica de estrutura de dados diferentes
    }
}
