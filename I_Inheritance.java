class A{ //Classes extends Object class by default
    public A() {
        System.out.println("In A");
    }

    public A(int n){ //Won't be called due to default call
        System.out.println("In A Int");
    }
}

final class B extends A{ //B can0t be extended
    public B(){
        /* Super is "call constructor of superior class" */
        super(); //Called by default, even if not written
        System.out.println("In B");
    }

    public B(int n){
        this(); //Executes default constructor of B
        System.out.println("In B Int");
    }
}



public class I_Inheritance {
    public static void main (String a[]) {
        B obj = new B(6);
    }
}

/* You can't inherit from multiple classes at the same time */
