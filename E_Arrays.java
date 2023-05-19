class Student {
    int id;
    String name;
}

public class E_Arrays {
    
     
    public static void main (String a[]){

        //In Java we use {} inside arrays, and mark the array in the variable name
        int num[] = {5, 6, 7};
        int num1[] = new int[4]; //4 values, all 0
        
        System.out.println(num[0]); //Call it same as JS.
        
        num[1] = 4; //You can change values like this.

        for (int n : num) { //Calling a for - in in Java
            System.out.println("For " + n);
        }

        int num2[][] = new int[3][4]; //Multidimensional array

        for (int n[] : num2) {
            for (int n2 : n){
                System.out.print(n2 + " ");
            }
            System.out.println();
        }

            //JAGGED ARRAYS - Don't know how many you have inside
            int num3[][] = new int[3][];

            num3[0] = new int[2]; //You have to specify EACH inner array.

            //OBJECT ARRAY
            Student s1 = new Student();
            s1.id = 1;
            s1.name = "John";

            Student s2 = new Student();
            s2.id = 2;
            s2.name = "Doe";

            Student students[] = new Student[2]; //Array of students
            students[0] = s1;
            students[1] = s2;


            //ARRAYS DRAWBACKS IN JAVA
            //Fixed size, fixed type, require calculations to find things, use memory continuously
    }
}
