public class pattern5 {
    public void pattern(int n) {

        for(int i=n; i>=1; i--) {

            for(int j=i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern5 pt = new pattern5();
        pt.pattern(5);
    }
}