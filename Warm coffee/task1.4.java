import java.util.Scanner;

public class task 1.4
{

    public static void main(String[] args) {

        int intValue;
        float floatValue;
        double doubleValue;
        long longValue;
        char charValue;
        String stringValue;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        intValue = scanner.nextInt();

        System.out.print("Enter a float value: ");
        floatValue = scanner.nextFloat();

        System.out.print("Enter a double value: ");
        doubleValue = scanner.nextDouble();

        System.out.print("Enter a long value: ");
        longValue = scanner.nextLong();

        System.out.print("Enter a character value: ");
        charValue = scanner.next().charAt(0);

        scanner.nextLine();

        System.out.print("Enter a string value: ");
        stringValue = scanner.nextLine();

        scanner.close();

        System.out.println("Integer Value: " + intValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("String Value: " + stringValue);
    }
}