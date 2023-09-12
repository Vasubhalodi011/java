public class Commander2 {

    public static void main(String[] args) {

        Integer a[] = {10,20,30,40,50,60,70,80,90,100};

        Integer b[] = {10,20,30,40,50,60,70,80,90,100};

        Integer sum[] = new Integer[10];

        for(int i= 0; i<sum.length;i++){
            sum[i] = a[i]+b[i];
            System.out.println(sum[i] );
        }
        
}
}