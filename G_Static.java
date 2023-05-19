class Phone {
    String model;
    int price;
    static String name; //Name will be equal for ALL phones

    public void show(){
        System.out.println(model + "-" + price + "-" + name);
    }

    static {
        name = "Phone"; //Static block is called just ONCE and first
        System.out.println("Static block called.");
    }

    public Phone(){
        model = "Thing"; //Constructor is called on creation
        price = 0;
        System.out.println("Constructor block called.");
    }

    public static void show1(){
        System.out.println("Static method " + name); //You can call static variables
    }
} 

public class G_Static {
    public static void main (String a[]){
        Phone p1 = new Phone();
        p1.model = "Galaxy 1";
        p1.price = 750;
        p1.name = "Samsung";

        Phone p2 = new Phone();
        p2.model = "Galaxy 2";
        p2.price = 800;
        p2.name = "Fake Apple"; //ALL phones are fake apple now

        //It should be called as Phone.name instead, it's more accurate

        Phone p3 = new Phone();

        p1.show();
        p2.show();
        p3.show();

        Phone.show1(); //Static method can be called directly from class
    }
}
