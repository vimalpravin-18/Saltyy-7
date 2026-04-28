public class pattern7 {
    
    public void pattern(int n) {
        
        for(int i=0; i<n; i++) {

            for(int sp=0; sp<n-i; sp++) {
                System.out.print(" ");
            }

            for(int j=0; j<=i-1; j++) {
                System.out.print("*");
            }

            for(int j=n-i; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern7 pt = new pattern7();
        pt.pattern(5);
    }
}
