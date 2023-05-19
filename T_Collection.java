import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class T_Collection {
    public static void main(String a[]){
        //Collection is an interface
        //There is a lot of classes that implements collection
        //For example: List, Queue, Set...

        Collection<Integer> nums = new ArrayList<Integer>();
        //<> Specifies the kind of object you are working with

        nums.add(6);
        nums.add(2);

        System.out.println(nums); //You can print it, it's not an array
        //Collection has NO index, if you need them use List

        //Set works with unique values and don't follow the sequence
        Set<Integer> num2 = new HashSet<Integer>();
        num2.add(2);
        num2.add(2);
        num2.add(8);
        num2.add(1);

        for(int n : num2){
            System.out.println(n);
        }

        //TreeSet sort the things in order
        Set<Integer> num3 = new TreeSet<Integer>();
        num3.add(5);
        num3.add(2);
        num3.add(5);

        for(int n : num3) System.out.println("Num 3 " + n);


    }
}
