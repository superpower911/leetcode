import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/25 16:10
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,2,4,7,9,1);
        Predicate<Integer> predicate = n -> n%2 == 1;
        Function<Integer,Integer> function = n -> n*3;
        list.stream()
                .sorted((a,b)-> b-a)
                .filter(n -> n % 2 == 1)
                .map(function).forEach(n-> System.out.println(n));



    }
}