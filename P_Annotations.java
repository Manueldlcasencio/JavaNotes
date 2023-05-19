class A{
    public void show(){
        System.out.println("In A");
    }
}

class B extends A{
    @Override //It provokes an error if you are not doing that (preventing mistakes)
    public void show(){
        System.out.println("In B");
    }
}

@FunctionalInterface
interface C{ //Interface with just ONE function
    void show(int num);
}

public class P_Annotations {
    public static void main(String a[]){
        C obj = (num) -> System.out.println("Hi"); //Lambda expression
        //It only works with funcitonal interface
    }
}
