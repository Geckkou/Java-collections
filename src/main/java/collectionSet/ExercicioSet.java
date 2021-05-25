package collectionSet;

import java.util.*;

public class ExercicioSet {
    public static void main(String[] args) {
       Set<Integer> n = new HashSet<>();

        n.add(4);
        n.add(2);
        n.add(23);
        n.add(14);
        n.add(55);

        System.out.println(n);
        n.add(44);
        System.out.println(n);

        n.remove(3);
        n.add(23);
        System.out.println(n.size());
        System.out.println(n);
        System.out.println(n.isEmpty());

        n.add(null);
        System.out.println(n);

        //LinkedHashset
      /*  LinkedHashSet<Integer> n = new LinkedHashSet<>();

        n.add(3);
        n.add(88);
        n.add(20);
        n.add(44);
        n.add(3);

        Iterator<Integer> iterator = n.iterator();
            while(iterator.hasNext()){
                System.out.println("-----> " + iterator.next());
            }

        n.remove(3);
        n.add(23);
        System.out.println(n.size());
        System.out.println(n);
        System.out.println(n.isEmpty());

       */

        //Treeset
       /* TreeSet<Integer> n = new TreeSet<>();

        n.add(3);
        n.add(88);
        n.add(20);
        n.add(44);
        n.add(3);

        for(Integer numeros:n ){
            System.out.println("=======> " + numeros);
        }

        n.pollFirst();
        n.add(23);
        System.out.println(n.size());
        System.out.println(n.isEmpty());
        System.out.println(n);

        */
    }
}
