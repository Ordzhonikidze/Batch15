package Primitives;


import org.w3c.dom.ls.LSOutput;

public class UnaryOperators2 {
    public static void main(String[] args) {


        //pre- increment , pre-decrement--> ++name, --name
        // post-increment, post-decrement--> name++, name--


        int burgers = 20;

        int sum = burgers++ + ++burgers + 5 + ++burgers / 2;
        System.out.println("The sum is :" + sum);

        System.out.println("Burger  number " + burgers);

        int a = ++burgers, b = a++, c = --burgers;
        System.out.println(a);
        System.out.println(b);
        System.out.println(++a + --b);


    }

}
