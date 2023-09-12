public class Array {
    public static void main(String[] args) {
        InnerArray ia = new InnerArray();
        ia.getter();
    }
}

class InnerArray {
    int ary[] = { 10, 20, 50, 66, 45, 26, 1, 500 };
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
        System.out.println("Maximun Value is : " + max);
        System.out.println("Minimum Value Is : " + min);
    }
}