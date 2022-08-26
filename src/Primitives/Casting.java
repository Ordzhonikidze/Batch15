package Primitives;

public class Casting {
    public static void main(String[] args) {


        // Larger numerical data type to smaller numerical data type

        long lg = 25;

        //int i = lg; compile time error, trying to store larger data type to smaller data type , require  casting

        System.out.println("lg>>" + lg);

        int i1 = (int) lg;

        System.out.println("i1>>" + i1);

        long lg2 = 456788765678l;

        int i2 = (int) lg2;
        System.out.println("i2>>" + i2);

        //from decimal to whole

        double db1 = 2.3;
        System.out.println("db1 >>" + db1); //2.3
        short sh1 = (short) db1;
        System.out.println("sh1>>" + sh1); //2

        short sh2 = (byte) db1;

        byte bt1 = (byte) db1;

        char ch1 = 'd';

        int i3 = ch1;
        short sh3 = 'r';

        System.out.println("i3>>" + i3);//

        byte b1 = 4, b2 = 5;

        byte r1 = (byte) (b1 + b2); // we should cast the final result of the arithmetic operators
        // to make data type to compile/match

        System.out.println("r1>>" + r1);

        short r2 = (byte) (b1 + b2);
        System.out.println(r2);

        // you bough two phones
        //- short--> 275, short -- 800
        // store the total cost as short and show it on the console

        short s1 = 275, s2 = 800;

        short e1 = (short) (s1 + s2);
        System.out.println("e1>>" + e1);


    }
}
