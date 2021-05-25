package collectionStream;

import collectionsComparators.Estudante;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Alexandre", 19));
        estudantes.add(new Estudante("Duda", 20));
        estudantes.add(new Estudante("Clara", 18));
        estudantes.add(new Estudante("Rafael", 23));
        estudantes.add(new Estudante("Milles", 17));
        estudantes.add(new Estudante("Peter", 25));

        System.out.println("Quantidade de alunos: " + estudantes.stream().count());

        System.out.println("Estudantes maiores de idade: " + estudantes.stream().filter((estudante) ->
                estudante.getIdade() > 18).collect(Collectors.toList()));

        estudantes.stream().forEach(System.out::println);

        System.out.println("Estudantes com letra B no nome: " + estudantes.stream().filter((estudante) ->
                estudante.getNome().toLowerCase().contains("b")).collect(Collectors.toList()));

        System.out.println("Existem estudandes com letra D no nome? "  + estudantes.stream().anyMatch((elemento) ->
                elemento.getNome().contains("D")));

        System.out.println("Estudante com maior idade: " + estudantes.stream().max(Comparator.comparingInt(Estudante::getIdade)));
        System.out.println("Estudante com menor idade: " + estudantes.stream().min(Comparator.comparingInt(Estudante::getIdade)));





    }
}
