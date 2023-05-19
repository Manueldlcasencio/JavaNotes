import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class W_Collections {
    public static void main (String a[]){
        List<Integer> num = new ArrayList<Integer>();
        num.add(22);
        num.add(76);
        num.add(50);
        num.add(11);

        System.out.println("Not sorted " + num);

        Collections.sort(num); //Collections can sort it easily
        System.out.println("Sorted " + num);

        //Custom comparation for sorting
        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                //In this method 1 means "swap"
                //The example checks the last value
                if(i%10 > j%10) return 1;
                else return -1;
            }
        };

        Collections.sort(num, com);
        System.out.println("Sorted twice " + num);
    }
}

