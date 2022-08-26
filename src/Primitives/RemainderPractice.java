package Primitives;

public class RemainderPractice {

    public static void main(String[] args) {

        /*
        find sum  of the digits from given integer number
        int number = 123;

        1+2+3=6; "The sum of the digits of <number> is .....6.."

           345--> 3+4+5=>12

            */
        int number = 111;  //number is 123
        int temp = number;
        int digit1 = number % 10; // remainder is 3

        number = number / 10;//number is 12

        int digit2 = number % 10; // remainder is 2

        number = number / 10;//number1

        int digit3 = number % 10; // remainder is 1
        System.out.println("The sum of digits of " + temp + "is" + (digit1 + digit2 + digit3));


    }


}
