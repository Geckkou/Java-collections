package collectionOptionals;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor opcional");

        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.isEmpty());

        optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor não está presente"));

        if(optionalString.isPresent()){
            String valor = optionalString.get(); //retorna um erro se vazio

            System.out.println(valor);
        }

        optionalString.map((valor) -> valor.concat("*****")).ifPresent(System.out::println); //trandforma o valor em alguma outra coisa

        System.out.println(optionalString.orElseThrow(IllegalStateException::new)); //se o optional estiver presente se n ele lança um exeception
    }
}
