public class Project_6 {
    public static void main(String[] args) {
        InnerArray r = new InnerArray();
        r.getter();
    }
}

class InnerArray {
    int ary[] = { 10, 20, 50, 69, 45, 62, 1, 499 };
    int max = ary[0];
    int min = ary[0];
    int i;

    void getter() {
        for (int i = 1; i < ary.length; i++) {
            if (ary[i] > max) {
                max = ary[i];
            }

            if (ary[i] < min) {
                min = ary[i];
            }
        }
        System.out.println("Maximum Value is : " + max);
        System.out.println("Minimum Value Is : " + min);
    }
}