package collectionSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adiciona os numeros no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        // Remove o número do set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        // Retorna a quantidade de intens no set
        System.out.println(sequenciaNumerica.size());

        // Navega em todos os itens do itartor
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Integer numero: sequenciaNumerica){
            System.out.println(numero);
        }

        //Retorna se o set esta vazio ou nao
        System.out.println(sequenciaNumerica.isEmpty());
    }
}