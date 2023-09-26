import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {

        Triangle n = new Triangle();
        n.Calculate();

    }

}

class Ractangle {

    Scanner scanner = new Scanner(System.in);
    double lenght;
    double width;

    public void Calculate() {

        System.out.print("Enter Lenght = ");
        lenght = scanner.nextDouble();
        System.out.print("Enter width = ");
        width = scanner.nextDouble();

        System.out.println("Area of Ractangle = " + (lenght * width));
        System.out.println();

    }

}

class Triangle extends Ractangle {

    double base;
    double hight;

    public void Calculate() {
        super.Calculate();

        System.out.print("Enter base = ");
        base = scanner.nextDouble();
        System.out.print("Enter hight = ");
        hight = scanner.nextDouble();

        System.out.println("Area of Triangle = " + (base * hight / 2));

    }

}