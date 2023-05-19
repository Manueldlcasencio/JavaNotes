class B_Operators {
    public static void main (String a[]){

        int num1 = 6;
        int num2 = 9;

        if (num1 > num2 & num1 == 6) {
            System.out.println("Case One");
        }
        else if (num2 > num1 || num2 == 20) {
            System.out.println("Case Two");
        }

        //In Java, operators are & |  !
        //You can double it && || ! (not can't be doubled)
            //Dobuled means it doesn't check the second one if not needed

        int result = num1 == 6 ? 6 : 7; //Ternary same as JS

        int num3 = 1;

        switch(num3){
            case 0:
                System.out.println("It's 0");
                break; //Exist the block, don't check any other case
            case 1:
                System.out.println("It's 1");
                break;
            default: //Anything else
                System.out.println("It's whatever");
        }
    }
}