package Primitives;

public class Task1 {
    public static void main(String[] args) {

        /* you bought a laptop for $1265,your monthly payment are $100,find our last month's payment

         */


        int laptop$ = 1265, paymentMonthly = 100, lastPayment;

        lastPayment = laptop$ % paymentMonthly;
        System.out.println("Your last month's payment is:" + lastPayment);


    }
}
