class Calculator {
    int n = 0; //Variables can be outside the method
    
    public int add(int n1,int n2){ //Access, return type, name || Method
        System.out.println("Calculator class");
        int r = n1 + n2;
        return r;
    }

    public int add(int n1, int n2, int n3){ //Method overloading. Same name, more params
        return n1 + n2 + n3;
    }
}

public class D_ObjectsAndClass {
    public static void main (String a[]){

        Calculator calc = new Calculator(); //Create a calculator object here
        calc.add(1, 2); //This will work calling the NEW calculator

        new Calculator().add(1,2); //Creates an anom calculator object
        /* ONE USE object */
    }
}