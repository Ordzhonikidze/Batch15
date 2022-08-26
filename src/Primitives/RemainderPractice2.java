package Primitives;

public class RemainderPractice2 {

    public static void main(String[] args) {
        /*
        find the product of digits from given number
        222==> 2*2*2 = 8
         */

        int number = 222;

        int temp = number;// taking the last digit
        int digit1 = number % 10; // updating the number
        number = number / 10;

        int digit2 = number % 10;
        number = number / 10;

        int digit3 = number % 10;
        number = number / 10;

        System.out.println("The sum of product" + temp + "is" + (digit1 * digit2 * digit3));


    }
}
