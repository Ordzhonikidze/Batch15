package Scanner;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {
        /*
        David wants to deposit his money into his bank account
        -he already got$200 in his account
        - he got three different paychecks ($480,$600 and $350)
        - he can only deposit one paycheck at a time
        - after he got his money in the account
        - he bought a phone for $599 and headphone for $299
        -calculate his final  money in his account
         */

       /* Scanner input= new Scanner(System.in);

        int has$ = 200;

        System.out.println(" plase eneter his paychecks");
        int paycheks = input.nextInt();

        System.out.println("Please enter his sales");

        int sales = input.nextInt();

*/

        Scanner scanner = new Scanner(System.in);

        double balance = 200; //firstCheck, secondCheck, ThirdCheck , phonePrice, HeadphonePrice ;

        System.out.println("Please enter first check amount");

        double firstCheck = scanner.nextDouble();
        balance += firstCheck;

        System.out.println("Please enter second check amount");
        double secondcheck = scanner.nextDouble();
        balance = balance + secondcheck;

        System.out.println("Please enter third check amount");
        balance = balance + scanner.nextDouble();

        System.out.println("Please enter the Phone Price");

        double phone$ = scanner.nextDouble();
        balance = balance - phone$;

        System.out.println("Please enter the Head Phone Price");

        balance = balance - scanner.nextDouble();

        System.out.println("This is your final balance" + balance);


    }


}
