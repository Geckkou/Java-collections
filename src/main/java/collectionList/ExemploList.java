package collectionList;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Gecko");
        nomes.add("Alexandre"); //adiciona itens a lista
        nomes.add("Mikasa");
        nomes.add("Gerald");
        nomes.add("Eren");
        System.out.println(nomes);

        nomes.set(2, "Rengar");// troca o conteudo de um elemento especificando sua posiçao
        System.out.println(nomes);

        Collections.sort(nomes); //ordena a lista

        nomes.set(2, "Slander");

        System.out.println(nomes);
        nomes.remove(4); //remove(index) um elemento indicando a posiçao
        System.out.println(nomes);

        nomes.remove("Slander"); //remove(object) um elemnto dizendo seu nome
        System.out.println(nomes);

        String nome = nomes.get(1); //retorna para um variavel o elemento dado o index
        System.out.println(nome);

        int posicao = nomes.indexOf("Carlos"); //retorna a posiçao de um elemento dizendo seu conteudo
        System.out.println(posicao);

        int tamanho = nomes.size();//retorna uma numero inteiro dizendo quantos elementos tem na lista
        System.out.println(tamanho);

        boolean tem = nomes.contains("anderson"); //retorna um booleano para saber se um elemnto existe ou nao na lista
        System.out.println(tem);

        boolean vazia  = nomes.isEmpty(); //nao receb nenhum argumento so retorna um booelano se a lista estiver ou nao vazia
        System.out.println(vazia);

        for (String nomeDoItem: nomes){
            System.out.println("----> " + nomeDoItem); //imprime a lista
        }

       Iterator<String> iterator =  nomes.iterator(); //intera os elemntos da lista
        while(iterator.hasNext()){ //retorna um elemnto true sempre q existir mais de um elmento na lista
            System.out.println("......> " + iterator.next()); //retorna o objeto que vc esta entregando no momento
        }


        nomes.clear(); //esvazia a lista
    }
}
