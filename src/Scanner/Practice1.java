package Scanner;


import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        String text = new String();

        String a = "134km5342;";
        text = "Java";

        System.out.println(text);

        Scanner scanner = new Scanner(System.in);

        String myName = "sam";

        System.out.println("Please enter your name");
        myName = scanner.nextLine();

        System.out.println("Hello " + myName);

        System.out.println("Please enter your last name");

        String lastname = scanner.nextLine();

        System.out.println(" Your full name is:  " + myName + " " + lastname);

        System.out.println("Please enter your zip code  as number");
        int zipCode = scanner.nextInt();

        System.out.println("Hey " + myName + " You are living in this " + zipCode + " zip code");

        scanner = new Scanner(System.in);
        // scanner.nextLine();


        // task : get address off user and show it as "****.......*******"

        System.out.println("Erter your address");


        String address = scanner.nextLine();

        System.out.println("*******" + address + "******");

        System.out.println("enter your Phone number");

        long phoneNumber = scanner.nextLong();
        System.out.println("Is this Phone number correct?" + phoneNumber);

        String yesNo = scanner.next();

        System.out.println("You said" + yesNo);


    }
}
