class C_Loops{
    public static void main (String a[]){
        //While, do while, for

        int i = 1;
        while(i <= 5){
            System.out.println("While test " + i);
            i++;
        }

        do { //It executes once even if condition is not met
            System.out.println("Do While test " + i);
            i++;
        }while(i <= 5);

        for (int j = 1; j <= 5; j++) {
            System.out.println("For test " + j);
        }
    }
}