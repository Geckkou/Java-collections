package collectionQueue;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for(String clients: nomes){
            System.out.println("Cliente: " + clients);
        }

        System.out.println(nomes.peek());
        System.out.println(nomes);

        System.out.println("");

        System.out.println(nomes.poll());
        System.out.println(nomes);

        nomes.add("Daniel");
        System.out.println(nomes);

        System.out.println(nomes.size());

        System.out.println(nomes.isEmpty());

        System.out.println(nomes.contains("Carlos"));





    }
}
