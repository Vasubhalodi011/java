import java.util.Scanner;

public class Second_project {
    public static void main(String[] args) {

        BoB bob = new BoB();
        bob.getRateOfInterest();
        bob.setter();

    }

}

abstract class Bank {
    float amount;
    float pr;
    float month;
    float total_interest_rate;
    final float interest = 8.94f;
    float v;
    float year;
    Scanner scanner = new Scanner(System.in);

    abstract public void getRateOfInterest();

    abstract public void setter();

}

class BoB extends Bank {

    public void getRateOfInterest() {

        System.out.print("Enter of Month EMI = ");
        amount = scanner.nextInt();
        System.out.print("Interest of yearly EMI = ");
        v = scanner.nextFloat();
        pr = amount * interest / 100;
        month = amount + pr;
        year = month * 12;
        total_interest_rate = pr * 12;
        v = v * year;

    }

    public void setter() {

        System.out.println("Hole Month Interest Amount " + month);
        System.out.println("Hole year Tnterest Amount " + year);
        System.out.println("HOle year Total Tnterest " + total_interest_rate);

        System.out.println("<-><-<-><-><-><-><-><-><-><-><-><-><-><-><->");

        System.out.println("Full year Loan Amount = " + v);

    }

}
