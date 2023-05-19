interface Computer {
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code in lap...");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code in desk...");
    }
}

class Developer {
    public void devApp(Computer obj){
        obj.code();
    }
}

public class N_Interfaces2 {
    public static void main(String a[]){

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        dev.devApp(desk);

        //Both are valid, as they are computer class
    }
}
