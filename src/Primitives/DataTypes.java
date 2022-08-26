package Primitives;

public class DataTypes {

    public static void main(String[] args) {

        // byte, short, int, long,float, double, boolean;

        byte num1 = 127;
        byte num2 = -128;
        // byte num3 = 200, byte data type can only store in range of - 128 to 127;


        short num3 = 4;
        System.out.println("This is num3 before reassigning :" + num3); // 4
        // num1 = num3; you cannot store short data type to the byte data type

        num3 = num1;
        System.out.println("The is num 3:" + num3); //  The is num3: 127


        int num4 = num1 + 5 + num3;

        System.out.println(num4); //137
        System.out.println(num4);

        long num5 = 3;

        long num6 = 64679876533456l;

        //===========
        float num7 = 2.3f;
        float num9 = 2;
        System.out.println(" num9 wich  is floating number as 2 >>" + num9);

        double num8 = 7;

        System.out.println("num8:" + num8);

        double num10 = 6;
        System.out.println("This is num10>>" + num10);

        // CHAR

        char letter = 'a';

        System.out.println(letter);

        char number = '6';

        System.out.println(number);//6

        char symbol = '#';
        System.out.println(symbol); //#

        char num101 = 'T';
        System.out.println(num101); //T

        System.out.println(num101 + num10);


        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }
}
