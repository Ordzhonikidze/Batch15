package Primitives;

public class BooleanPractive {
    public static void main(String[] args) {
        // boolean data type can only take true  or false as  value

        boolean isEmpty = true;

        System.out.println(isEmpty);//true
        System.out.println(isEmpty);//true
        System.out.println(isEmpty);//true
        System.out.println(isEmpty);//true
        System.out.println(isEmpty);//true


        isEmpty = false;
        System.out.println(isEmpty);
        System.out.println(isEmpty);
        System.out.println(isEmpty);
        System.out.println(isEmpty);


        boolean isLightOn = true;
        isLightOn = isEmpty;

        System.out.println(isEmpty);

        System.out.println(isLightOn);

        System.out.println("-------");
        System.out.println(!isLightOn);// is going to make boolean to its opposite value (true<-> false)


        System.out.println(5 == 5);
        System.out.println(5 == 4);


    }

}
