import java.util.Scanner;

public class task 1.1
{

    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number = 1");
        a = sc.nextInt();

        System.out.println("enter number = ");
        b = sc.nextInt();

        System.out.println("enter number = ");
        c = sc.nextInt();

        if (a < c) {
            if (a < c) {
                System.out.println(a + " is small = ");
            } else {
                System.out.println(c + " is small = ");
            }

        } else {
            if (b < c) {
                System.out.println(b + " is small = ");
            } else {
                System.out.println(c + " is small = ");
            }
        }

    }
}