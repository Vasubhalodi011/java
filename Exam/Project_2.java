import java.util.Scanner;

public class Project_2 {
    public static void main(String[] args) {
        Chek s = new Chek();
        s.setter();
    }
}

class Chek {
    Scanner scan = new Scanner(System.in);
    int a;

    void setter() {
        System.out.print("Enter Number = ");
        a = scan.nextInt();
        if (a > 0) {
            System.out.println("Number Is Positiv");

        } else if (a == 0) {
            System.out.println("Number Is Zero");

        } else {
            System.out.println("Number Is Negetive");

        }
    }
}