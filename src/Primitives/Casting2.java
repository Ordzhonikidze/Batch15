package Primitives;

public class Casting2 {

    public static void main(String[] args) {

        //127
        byte b1 = 127, b2 = 1;

        byte r1 = (byte) (b1 + b2);
        System.out.println("Result:" + r1);//5
    }
}
