import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;


public class Ref {
    // Constructor 
    public Ref() {
    }

    // Static method reference.
    public void refer() {

        Function<String, Integer> parser = Integer::parseInt;
        Integer result = parser.apply("762");
        System.out.println(result);

        // Example: Using instance method on String object
        String str = "Java practice";
        Supplier<Integer> lengthGetter = str::length;
        int length = lengthGetter.get();
        System.out.println(length);

        // Example: Using instance method on String object
        String str2 = "young boy"; 
        Supplier<Integer> lengthGetter2 = str2::length; 
        int length2 = lengthGetter2.get();
        System.out.println(length2);

        // Example: Using constructor reference
        Supplier<StringBuilder> builderSupplier = StringBuilder::new;
        StringBuilder builder = builderSupplier.get(); // creates a new instance of StringBuilder
    }

    public void coll_() {
        // looping
        // old method
        List<String> pairs = Arrays.asList("EURJPY", "USDJPY", "GBPJPY", "AUDJPY"); 
        for (String it : pairs)
            System.out.println(it);

        // using lambdas
        pairs.forEach(i -> System.out.println(i));

        // method reference
        pairs.forEach(System.out::println); 
    }

    public static void main(String[] args) {
        Ref ref = new Ref(); // Creating an instance of the Ref class
        ref.refer();
        ref.coll_();
    }
}
