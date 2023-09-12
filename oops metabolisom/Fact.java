public class Fact {
    public static void main(String[] args) {
        New n = new New();
        n.num();
    }

}

class New {
    int a = 5, f = 1;

    void num() {
        for (int i = 1; i <= a; i++) {

            f = f * i;
        }
        System.out.println(f);
    }

}