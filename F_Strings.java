public class F_Strings {
    public static void main (String a[]){

        //STRING can't be changed, it create a new variable in memory
        String s1 = "Example"; 

        //Buffer gives you a buffer of memory. Can be changed.
        StringBuffer s2 = new StringBuffer("Buffer");
        System.out.println(s2.capacity()); //Size of the buffer

        String s2string = s2.toString(); //Only way to convert
    }   
}
