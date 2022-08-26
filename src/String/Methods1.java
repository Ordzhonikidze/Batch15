package String;

public class Methods1 {
    public static void main(String[] args) {

        String name = "david";

        int a = name.length();

        //int lenght= name.length();
        System.out.println(name);// david
        System.out.println(a);//5

        System.out.println(name.length());


        name = name + "White";
        System.out.println(name.length());// 11

        //concat(); it will given string value to the string

        name = name.concat("is not here");
        System.out.println(name);

        int b = name.length();
        System.out.println("the length of the new string is" + b);

        //charAt();-->  takes an index number and returns that char at given index

        char letter = name.charAt(0);// at index 0 on the name D
        System.out.println(letter);//D


    }
}
