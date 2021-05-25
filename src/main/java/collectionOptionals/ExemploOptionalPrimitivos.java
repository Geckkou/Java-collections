package collectionOptionals;

import java.util.Optional;
import java.util.OptionalInt;

public class ExemploOptionalPrimitivos {
    public static void main(String[] args) {
        System.out.println("\n**** valor inteiro opcional *****");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("\n**** valor decimal opcional *****");
        Optional.of(55.2).ifPresent(System.out::println);

        System.out.println("\n**** valor longo opcional *****");
        Optional.of(23L).ifPresent(System.out::println);

    }
}
