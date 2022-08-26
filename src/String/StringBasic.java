package String;

import java.sql.SQLOutput;

public class StringBasic {
    public static void main(String[] args) {
        System.out.println("***Sunday***");

        String word = "Tuesday";

        System.out.println(word);

        String name = new String("David");
        System.out.println(word);

        System.out.println(word + name);
        word = name + "Souza";
        System.out.println(word);
        System.out.println("------------");
        System.out.println(name + " Souza");
        System.out.println(name);

        System.out.println(name + 55);// David 55
        System.out.println(name + 6 + 7);// David 67
        System.out.println(6 - 7 + name);// 13 David

        String result = name + " Brown ";//

        System.out.println(result);

        result += result;//
        System.out.println(result);//

        // String is immutable (unchangeable), unless you reasighn a new value or do concatenation (aading extra text/String to it)

        result = result + "Monday";
        System.out.println(result);

        String flower = "Rose";
        System.out.println(flower);// Rose

        flower = flower.concat(" is Red");
        System.out.println(flower); // Rose is Red??

        System.out.println(flower.concat("and beautiful"));
        System.out.println(flower);// String is immutable (unchangebale)
        int number1 = 5;// Primitives do not have methods/ function but OBJECT have behavior/function

        String number = "1";
        number += "2";
        number += 2;
        System.out.println(number);
        number += true;
        System.out.println(number);

        int x = Byte.MAX_VALUE;

        System.out.println(x);


    }

}
