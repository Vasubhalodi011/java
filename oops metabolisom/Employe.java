public class Employe {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.getter();

    }
}

class Emp {
    int id = 01;
    String name = "Prince";
    String desi = "Accounted";
    long salary = 50000;

    void getter() {

        System.out.println("Employ Id = " + id);
        System.out.println("Employ Name = " + name);
        System.out.println("Employe Designation = " + desi);
        System.out.println("Employe Salary = " + salary);

    }
}