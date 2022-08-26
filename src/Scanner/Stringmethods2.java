package Scanner;

import java.util.Locale;

public class Stringmethods2 {
    public static void main(String[] args) {
        String school = "Techtorial ";
        school = school.toUpperCase();
        System.out.println(school);

        String result = school.toLowerCase();
        System.out.println(result);//techtorial
        System.out.println(school);//TECHTORIAL

        System.out.println(school.startsWith("TECH"));
        boolean correct = school.endsWith("AL");
        boolean correct1 = school.endsWith("K");

        System.out.println(correct);
        System.out.println(correct1);


    }
}
