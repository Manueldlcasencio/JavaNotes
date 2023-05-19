abstract class Car { //It's "an idea"
    public abstract void drive (); //Declared, but not expanded
}

class Ford extends Car {
    public void drive() { //Inherited MUST define the abstract

    }
}

public class H_Abstract {  
    public static void main(String a[]) {
        Car obj = new Car(); //You can't create an object of an abstract class
        
    }
}
