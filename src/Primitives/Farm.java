package Primitives;

public class Farm {

    /*
    calculate the number of the legs in the farm if:

    there are 15 cows and 40 chickens
    - show the result as"There are total of .... legs in the farm"

     */
    public static void main(String[] args) {


        int cows = 15, chicken = 40, eachCowLegs = 4, eachChickenLeg = 2, totalLegs;

        totalLegs = (cows * eachCowLegs) + (chicken * eachChickenLeg);

        System.out.println("There are total of" + totalLegs + "legs in this farm");

        System.out.println("There are total of" + ((cows * eachCowLegs) + (chicken * eachChickenLeg)) + "legs in this farm");



        /*
        calculate the total worth of this farm if:
        -each cow is $1200
        -each chicken is $11.99
        -show the result as "The worth of the farm is :......."

         */

        double cow$ = 1200, chicken$ = 11.99;

        double worthOfFarm = cows * cow$ + chicken * chicken$;
        System.out.println("There worth of the farm is $" + worthOfFarm);



        /*
        build a new barn for the upcoming horses, you are going to spend money from the worth of you other animals
        -your spending is 1000
        how can you find it out how much money you have left after new barn build?

         */

        double spending = 1000;
        System.out.println(worthOfFarm - spending);


        // int TotalOfCow = 15*4;
        //int TotalOfChicken= 40*2;


    }
}
