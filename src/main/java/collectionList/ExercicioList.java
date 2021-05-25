package collectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larrissa");
        nomes.add("João");

        for(String lista: nomes){
            System.out.println("-----> " + lista);
        }

        nomes.set(2, "Roberto");
        System.out.println(nomes);

        String n = nomes.get(1);
        System.out.println(n);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("João");
        System.out.println(nomes);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean tem = nomes.contains("Juliano");
        System.out.println(tem);

        List<String> names = new ArrayList<>();
        names.add("Ismael");
        names.add("Rodrigo");
        names.addAll(nomes);
        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

        boolean vazia = names.isEmpty();
        System.out.println(vazia);
    }
}
