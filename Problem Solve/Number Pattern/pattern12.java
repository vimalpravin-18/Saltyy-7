public class pattern12 {
    public void pattern(int n) {

        for(int i=1; i<n; i++) {


            for(int sp=0; sp<=2*(n-1); sp++) {
                System.out.print(" ");
            }

            
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }

            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern12 sol = new pattern12();
        sol.pattern(4);
    }
}
