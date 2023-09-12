public class Constructor {
    
    public static void main(String[] args) {

        InnerConstructor ic = new InnerConstructor(10, 20);
        InnerConstructor inc = new InnerConstructor();

    }
}

class InnerConstructor {
    InnerConstructor() {
        System.out.println("Default Constructor");
    }

    InnerConstructor(int a, int b) {
        System.out.println("A = " + a + "B = " + b);
    }

}