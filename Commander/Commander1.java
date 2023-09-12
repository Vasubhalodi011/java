public class Commander1 {
    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 100;
        Integer ch = 4;
        System.out.println("press 1 for sum");
        System.out.println("press 2 for subtri");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for modulas");
        System.out.println("press 5 for divison");

        switch (ch) {
            case 1:
                System.out.println("sum of a + b = " + (a + b));
                break;

            case 2:
                System.out.println("subtri of a - b = " + (a - b));
                break;

            case 3:
                System.out.println("multiplication  of a * b = " + (a * b));
                break;

            case 4:
                System.out.println("modulas of a % b = " + (a % b));
                break;


            case 5:
                System.out.println("divison of a / b = "+(a/b));
                break;


            default:
                System.out.println("enter value nuber is dont match!!!");
                break;

        }
    }

}