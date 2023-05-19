class A{
    class B{
        public void show(){
            System.out.println("In show");
        }
    }
}

class C{
    public void show(){
        System.out.println("In C show");
    }
}

public class L_InnerClass {
    public static void main (String a[]){

        A obj = new A();
        A.B obj1 = obj.new B(); //To create inner class you need the parent

        C obj2 = new C(){ //"Anom inner class"
            public void show(){ 
                System.out.println("In new show"); //Override without new class
            }
        };

        obj2.show();
    }
}
