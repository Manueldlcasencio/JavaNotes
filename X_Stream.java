import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class X_Stream {
    public static void main (String a[]){

        //Short way of making the list instead of .add
        List<Integer> nums = Arrays.asList(4,5,6,7,2);

        //This allow to operate without modifying the list
        //Stream is used once, can't reuse it
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);

        //The strong point of Stream is the functions
        s2.forEach(n -> System.out.println(n));

        //Short way of writing it
        int result = nums.stream()
                        .filter(n -> n%2 == 0)
                        .map(n -> n*2)
                        .reduce(0, (c,e) -> c+e);

    }
    
}
