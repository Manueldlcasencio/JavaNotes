import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

public class R_Input {
    public static void main (String a[]) {
        //In this file try each one separatedly or it won't work
        
        try {
            System.out.println("Input a number");
            int num = System.in.read(); //Gets the ASCII value
            System.out.println("Num - " + num);
        }
        catch(Exception e) {
            System.out.println("Unexpected");
        }

        /* OLD METHOD */
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        //Bf returns a string, that's why we convert it to int
        //It can take the input from anywhere (files, net, etc)
      
      
        // try {
        //     System.out.println("Input in buffer");
        //     int num2 = Integer.parseInt(bf.readLine());
        //     System.out.println("Num in buffer - " + num2);
        // }
        // catch (Exception e) {
        //     System.out.println("Unexpected in buffer" + e);
        // }
        // finally {
        //     bf.close(); //Close the resource, so it can be used elsewhere
        // }
        
        Scanner sc = new Scanner(System.in); //Define where you get the input (in this case system.in - keyboard)
        int num3 = sc.nextInt();
        System.out.println(num3);
    }
}