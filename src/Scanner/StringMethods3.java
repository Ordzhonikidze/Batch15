package Scanner;

public class StringMethods3 {
    public static void main(String[] args) {

        String school = "Techtorial";

        System.out.println(school.contains("torial"));

        System.out.println(school.contains("key"));

        boolean result = school.equals("Techtorial");
        System.out.println(result);

        System.out.println(school.equals("torial"));

        boolean result1 = school.equalsIgnoreCase("techtorial");
        System.out.println(result1);

        String str = school.substring(3);
        System.out.println(str);
        System.out.println(str);

        String str1 = school.substring(2, 7);// 2,3,4
        System.out.println(str1);

        System.out.println(school);


    }
}
