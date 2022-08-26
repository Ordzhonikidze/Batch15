package Primitives;

public class TruthTableTask {
    public static void main(String[] args) {
        /*
        Average score  of 3 exams needs  to be 70 percent or more participation rate needs to be 80 percent or more
        Competion of homework needs  to be 90 percent  or more

        -Print a message to the user if they can PASS/NOT(TRUE/FALSE)
         */

        int e1 = 100, e2 = 50, e3 = 90, regAve = 70, regPartisipation = 80, myParticipation = 100,
                regHW = 90, MyHW = 100;

        int myAve = (e1 + e2 + e3) / 3;

        boolean examPass = myAve >= regAve;
        boolean partiPass = myParticipation >= regPartisipation;
        boolean HWPass = MyHW >= regHW;

        System.out.println("Are you passing the course?" + (examPass && partiPass && HWPass));


        // B+2 == 3*C || !TRUE && C < B / 3
        int b = 5, c = 2;

        boolean result = b + 2 == 3 * c || !true && c < b / 3;
        System.out.println(result);


    }
}
