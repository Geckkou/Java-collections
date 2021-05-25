package collectionQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll(); //Retorna o primeiro elemento da fila e o remove
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek(); //Retorna o primeiro elemento da fila mas não o remove, se a fila estiver vazia ele retorna null
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        String primeiroClienteOuErro = filaBanco.element(); //Retorna o primeiro elemento da fila mas não o remove, porem se a fila estiver vazia ele retorna uma exeçao
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String client : filaBanco) {
            System.out.println("-----> " + client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println(iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());




    }
}