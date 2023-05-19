class Human {
    private int age; //Only accessed inside the class
    private String name;

    public void setData(int newAge, String newName){ //Manipulate the private variable
        age = newAge;
        name = newName;
    }

    public String getData(){
        return name + " " + age;
    }
}

public class H_Encapuslation {
    public static void main (String a[]){
        Human one = new Human();

        one.setData(23, "John");
        System.out.println(one.getData());
    }
}

/* SUMMARY */
// Public can be accessed everywhere.
// Private can be accessed only inside the class.
// Default can be accessed inside the package.
// Protected works on same package, and children class.
