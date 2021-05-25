package collectionOptionals;

import java.util.Optional;
import java.util.OptionalInt;

public class ExercicioOptional {
    public static void main(String[] args) {

      /*  Optional<String> optinalv = Optional.empty();
        optinalv.ifPresentOrElse(System.out::println, () -> System.out.println("empty = Valor vazio"));
        System.out.println(optinalv.orElseThrow(IllegalStateException::new));

       */

        Optional<String> optionalp = Optional.of("Valor presente");
        optionalp.ifPresentOrElse(System.out::println ,() ->System.out.println("Valor não presente"));
        optionalp.ifPresent(System.out::println);

        if(optionalp.isPresent()){
            String val = optionalp.get();
            System.out.println(val);
        }
        optionalp.map((val) -> val.concat(" ***** ")).ifPresent(System.out::println);

        if(optionalp.isPresent()){
            OptionalInt.of(12).ifPresent(System.out::println);
        }

        Optional<String> optionaln = Optional.ofNullable(null);
        optionaln.ifPresentOrElse(System.out::println, () -> System.out.println("null = Valor não presente"));
        if(optionaln.isEmpty()){
            System.out.println("Valor vazio");
        }
    }
}
