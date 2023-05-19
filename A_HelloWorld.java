class A_HelloWorld {

    public static void main(String a[]) {
        
        int num = 5;
        float marks = 5.5f;

        // Literals
        int num1 = 0b101; //Binary
        int num2 = 0x001; //Hexa

        int num3 = 1_000_000; //You can separate it

        char b = 'b';
        b++; //This would print B, as it's the next char

        //Conversion is auto, casting is manual
        int n = 12;
        byte n2 = 127;
        // b = a Can't be done, error due to different type
        n2 = (byte)n; //It converts the type, "casting"
        //Conversion doesn't work when you can lose info due to types

        //Division with reminder
        int num4 = 5;
        int num5 = 6;

        int result1 = num4 % num2;

        //Increments
        ++num ;//Increment first, use later
        num++; //Use first, increment later

        int result = num++; //This would be 5, as increment is later
        System.out.println("Hello World");

        final int num6 = 5; //Final made it a constant.
    }

}