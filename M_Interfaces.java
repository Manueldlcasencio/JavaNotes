interface A { //Same as abstract class
    void show(); //By default public abstract
    void config();

    int age = 5; //By default it's final and static
}

interface Z extends A { //Inheritance is valid

}

class B implements A{ //Interface is a blueprint
    //A class can implements multiple interfaces

    int age = A.age; //Variables won't get "inherited". It's implement
    
    public void show(){
        System.out.println("In show");
    }

    public void config(){
        System.out.println("In config");
    }
}

public class M_Interfaces {
    public static void main (String a[]){

    }
}

//Class -> Class | extends
//interface -> Class | implements
//interface -> interface | extends
