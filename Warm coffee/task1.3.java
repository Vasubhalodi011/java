import java.util.Scanner;

public class task 1.3
{

    public static void main(String[] args) {

        int nutral;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        nutral = s.nextInt();

        if (nutral > 0) {
            System.out.println(nutral + "enter number is possitve ");
        }
        if (nutral == 0) {
            System.out.println(nutral + "enter number is zero");
        } else {
            System.out.println(nutral + "enter number is nagative");
        }
    }

}