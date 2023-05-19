import java.util.HashMap;
import java.util.Map;

public class U_Map {
    public static void main (String a[]){
        //Map represents key and value

        Map<String, Integer> students = new HashMap<>();

        students.put("Mark", 56);
        students.put("John", 75);

        students.put("Mark", 60); //Overwrite the previous

        System.out.println(students);
        System.out.println(students.get("John"));

        System.out.println(students.keySet()); //Prints the keys

        for(String name : students.keySet()) System.out.println(name + " : " + students.get(name));
    }
}
