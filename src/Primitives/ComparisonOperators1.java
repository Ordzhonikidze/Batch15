package Primitives;

public class ComparisonOperators1 {
    public static void main(String[] args) {

        int num1 = 35, num2 = 20 + 15;

        //== equals

        boolean result1 = num1 == num2;
        System.out.println(result1); // true

        boolean result2 = num1 == num2--;
        System.out.println(result2);

        boolean result3 = num1 == num2;
        System.out.println(result3);//

        num2++;

        System.out.println(num1 == num2);// true

        System.out.println(num1 == num2++);
        System.out.println(num1 == num2++);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("===============");
        System.out.println(num1 == --num2);
        System.out.println(num1);
        System.out.println(num2);
        // NOT EQUALS TO--> it will compare two values if they are the not same it will return TRUE, otherwise FALSE


    }
}
