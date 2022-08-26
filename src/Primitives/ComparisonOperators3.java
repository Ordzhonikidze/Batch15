package Primitives;

public class ComparisonOperators3 {
    public static void main(String[] args) {


        /* event, if the child's  age is less than 7, they can attend

         */

        int kAge = 1, requareAge = 7;

        boolean canAttend = kAge < requareAge;
        System.out.println("Can child atten?" + canAttend);

        /* event, if the cild1s  age is greater than7, they can attend */

        boolean canAttend1 = kAge > requareAge;
        System.out.println("Can child attend?" + canAttend1);

        /*
        there is picnic and only kids that are at age of 14  can attend
         */
        requareAge = 14;
        boolean canAttend2 = kAge == requareAge;
        System.out.println("Is the child's age 14?" + canAttend2);

        /* there is a party, they are not taking paople to the party if their age is 18

         */

        requareAge = 18;
        boolean canAttend3 = kAge != requareAge;
        System.out.println("Can Attend?" + canAttend3);


    }
}
