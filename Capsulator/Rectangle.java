public class Rectangle {

    public static void main(String[] args) {

        Result.getData();
    }
}

class Result {

    public static int lenght = 69;
    public static int width = 99;

    public static void getData() {

        System.out.println("Rectangle off = " + (lenght * width));

    }
}