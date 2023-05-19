public class K_WrapperClass {
    public static void main (String a[]){

        int num = 7;
        Integer num1 = num; //Autoboxing - new Integer(num)

        int num2 = num1.intValue(); //It's an object, use methods

        int num3 = num1; //Auto unboxing
    }
}
