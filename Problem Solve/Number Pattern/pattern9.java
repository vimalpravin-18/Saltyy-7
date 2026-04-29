public class pattern9 {
    public void pattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int sp = 0; sp < n - i - 1 ; sp++) {
                System.out.print(" ");
            }

            for(int j=1; j<=2*i+1; j++) {
                System.out.print("*");
            }

            for(int j=0; j< n-i-1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }


    public void InvertPyramid(int n) {

        for(int i=0; i<n; i++) {

            for(int sp=0; sp<i; sp++) {
                System.out.print(" ");
            }

            for(int j=1; j<=2*n-(2*i+1); j++) {
                System.out.print("*");
            }

            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern9 pt = new pattern9();
        pt.pattern(5);
        pt.InvertPyramid(5);
    }
}


