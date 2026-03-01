public class FullPyramid {
    public static void main(String[] args) {
        int n= 5;
        for(int i=1; i<=n; i++) {

            for(int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }

            for(int j=i-1; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }   
}


//               1
//              121
//             12321    
//            1234321