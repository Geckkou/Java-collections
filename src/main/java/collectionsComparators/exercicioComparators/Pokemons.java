package collectionsComparators.exercicioComparators;

public class Pokemons implements Comparable<Pokemons>{

    private final Integer dex;
    private final String nome;

    public Pokemons(String nome, Integer dex){
        this.dex = dex;
        this.nome = nome;
    }

    public String getNome(){return this.nome;}
    public Integer getDex(){return this.dex;}

    @Override
    public String toString(){return this.getNome() + " ----- " + this.getDex();}

    @Override
    public int compareTo(Pokemons o){
        return this.getDex() - o.getDex();
    }
}
