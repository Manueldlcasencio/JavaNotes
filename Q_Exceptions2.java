class A{
    public void show() throws Exception{ //Exception won't be managed here

    }
}


public class Q_Exceptions2 {
    public static void main (String a[]){
        A obj = new A();
        try {
            obj.show();
        }
        catch(Exception e){ //It's handled here
            System.out.println("Handled.");
        };
    }
}
