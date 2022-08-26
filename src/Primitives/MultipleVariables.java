package Primitives;

public class MultipleVariables {
    public static void main(String[] args) {

        int num = 1;

        int num2 = 5;

        int a, b, c, d;
        int e = 1, f = 2, g = 3, h = 5;

        double x = 23.1, y = 12.3, z; // it is possible to declare and/or initialize multiple variables
        // on the same line if they are having same data type.
        // they should be separated by comma.

        byte b1 = 2;
        short sh1 = 3;


        a = b1 + 5 + sh1;
        System.out.println(a);

        a = num2 + b1;
        System.out.println(a);//7

        // int a =11; you can nor create a new veriable with the same name more than once


        // using underscore

        int number = 3_000_000;


        long number1 = 4475_859_393_858_58l;

    }
}
