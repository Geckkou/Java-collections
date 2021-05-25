package collectionsComparators.exercicioComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioComparators {
    public static void main(String[] args) {
        List<Pokemons> pokemons = new ArrayList<>();

        pokemons.add(new Pokemons("Charizard", 15));
        pokemons.add(new Pokemons("Blastoise", 12));
        pokemons.add(new Pokemons("Bulbassauro", 9));
        pokemons.add(new Pokemons("Mewtwo",151));
        pokemons.add(new Pokemons("Mew", 149));
        pokemons.add(new Pokemons("lugia", 159));

        pokemons.sort(Comparator.comparingInt(Pokemons::getDex));
        System.out.println(pokemons);

        Collections.sort(pokemons, new PokemonsReverseDex());
        System.out.println(pokemons);

        pokemons.sort((first, second) -> first.getDex() - second.getDex());
        System.out.println(pokemons);


    }
}
