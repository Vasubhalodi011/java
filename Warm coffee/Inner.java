public class Inner {
    public static void main(String[] args) {

        ABC abc = new ABC();
        ABC.XYZ xyz = abc.new XYZ();
        ABC.pqr p = abc.new pqr();

        xyz.setdeta();
        p.show();

    }
}

class ABC {

    int a = 143;

    class XYZ {

        void setdeta() {

            System.out.println("value of A = " + a);
        }
    }

    class pqr {

        void show() {

            System.out.println("show methode");
        }
    }
}
