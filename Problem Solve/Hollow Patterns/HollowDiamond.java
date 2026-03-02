public class HollowDiamond {
    public static void main(String[] args) {
        int n=10;

        // upper Triangle

        for(int i=1; i<=n; i++) {

            for(int sp=1; sp<=n-i; sp++) {
                System.out.print(" ");
            }

            for(int j=1; j<=2*i-1; j++) {
                if(j==1 || j==2*i-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower triangle

        for(int i=n-1; i>=1; i--) {

            for(int sp=1; sp<=n-i; sp++) {
                System.out.print(" ");
            }

            for(int j=1; j<=2*i-1; j++) {
                if(j==1 || j==2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


//      *
//     * *
//    *   *
//   *     *
//  *       *
//   *     *
//    *   *
//     * *
//      *
