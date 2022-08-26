package Primitives;

public class Task2 {

    public static void main(String[] args) {

        /*
        if the location is in the range of 10 miles or less, delivery fee will  be $5.99
        otherwise, delivery fee will be 10.99
        if the large pizza is 17.99 and your are location is 10 miles away from the store
        -calculate and print the total payment.
        ?- since the location is on 10 miles range
        print that ?? your are paying less delivery fee ??
        - true or false
         */

        double pizza = 17.99;
        double delivery = 5.99;
        double total = pizza + delivery;
        System.out.println("The total is:" + total);

        int locationMiles = 10;
        int limit = 10;

        boolean payLessorNot1 = limit >= locationMiles;
        boolean payLessorNot2 = locationMiles <= locationMiles;
        System.out.println("You are paying less delivery fee:" + payLessorNot1);


    }

}
