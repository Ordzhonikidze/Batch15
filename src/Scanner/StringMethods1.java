package Scanner;

public class StringMethods1 {
    public static void main(String[] args) {
        String school = "techtorial";
        int length = school.length();
        System.out.println(length);
        // indexing starts from the 0
        // counting starts from the 1
        char ch = school.charAt(3);
        System.out.println(ch);
        // char ch1 = school.charAt(20); String IndexOutBoundsException
        int index = school.indexOf("t", 3);
        System.out.println(index);
        int index1 = school.indexOf("orl"); // -1
        System.out.println(index1);

        school = school.concat(" academy");// "techtorial+" academy"
        System.out.println(school);


    }
}
