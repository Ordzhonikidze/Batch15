package Primitives;

public class LogicalNegetion {
    public static void main(String[] args) {

        // Logical negetion -->! --> it will be used on boolean variables or boolean

        boolean isRed = false;

        System.out.println(isRed);// false
        System.out.println(isRed);
        System.out.println(isRed);
        System.out.println(isRed);
        System.out.println(isRed);

        System.out.println(!isRed); //true

        System.out.println(5 == 5);
        System.out.println(!(5 == 5));

        System.out.println("-----");
        System.out.println(true == false);
        System.out.println(!(true == false) == (true == false));

    }
}
