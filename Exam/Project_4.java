public class Project_4 {

    public static void main(String[] args) {

        Display display = new Display();

        display.Display("03", "vasu");

    }
}

class Display {

    String roll;
    String name;

    void Display(String roll, String name) {

        this.roll = roll;
        this.name = name;

        System.out.print("Roll no = " + roll);
        System.out.println();

        System.out.print("Name = " + name);

    }
}
