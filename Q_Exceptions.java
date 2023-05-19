class CustomException extends Exception{ //Custom exception

}

public class Q_Exceptions {
    public static void main(String a[]){
        int i = 0;
        int j;

        try
        {
            j = 9/i; //This will cause an error
        }
        catch(Exception e){ //Execute in case of error in try
            System.out.println("Error! " + e); //It prints the reason
        }
        /* EXCEPTION HANDLING */
        //Without the try-catch the code would stop at the error
        //Exception has a hierarchy, specific first, generic last
        //Object -> Throwable -> Exception -> RuntimeException -> ArithmeticException

        try{
            int k = 9/1;
            if (k == 9) throw new ArithmeticException(); //Provoke exception
        }
        catch(ArithmeticException e){ //Specific exceptions to handle things
            System.out.println("Can't divide by zero");
        }
        catch(Exception e){ //Several catchs are allowed
            System.out.println("Something went wrong");
        }
    }
}
