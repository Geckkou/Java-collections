package collectionsComparators.exercicioComparators;

import java.util.Comparator;

public class PokemonsReverseDex implements Comparator<Pokemons> {

    @Override
    public int compare(Pokemons o1, Pokemons o2){return o2.getDex() - o1.getDex();}
}
