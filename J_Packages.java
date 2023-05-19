import Packs.Pack1;

import java.util.ArrayList; //Java integrated packages must be imported too

public class J_Packages {
    public static void main (String a[]){
        /* Package points to the folder, you need to import for use */
        Pack1 obj = new Pack1();
        obj.Print();
    }
}

/* IMPORTED BY DEFAULT */
//Java.lang.* (all) for example, System