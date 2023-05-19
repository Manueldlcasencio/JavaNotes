enum Status{ //It's a class for Java. CAN'T be extended
    Running, Failed, Pending, Success;
    //Name constants
}

enum Laptop{
    Macbook(2000), Surface(700);

    public int price;

    private Laptop(int price){ //Private constructor, only used in the same class
        this.price = price;
    }
}

public class O_Enum {
    public static void main (String a[]){
        Status one = Status.Failed;

        Laptop two = Laptop.Macbook;
        System.out.println(two + " : " + two.price);

        switch(one){ //Switch and if works with enum
            case Running:
                System.out.println("Run!");
                break;
            case Failed:
                System.out.println("Sorry..");
                break;
            case Pending:
                System.out.println("In a second");
                break;
            default:
                System.out.println("All good");
                break;
        }
    }
}
