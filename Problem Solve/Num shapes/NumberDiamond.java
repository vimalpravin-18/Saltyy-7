public class NumberDiamond {
    public static void main(String[] args) {
        int n=3; 

        // Upper triangle

        for(int i=1; i<=n; i++) {
            for(int sp=1; sp<=n-i; sp++) {
                System.out.print(" ");
            }
            for(int j=i; j<=2*i-1; j++)  {
                System.out.print(j);
            }
            for(int j=2*i-2; j>=i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Lower triangle

        for(int i=n-1; i>=1; i--) {
            for(int sp=1; sp<=n-i; sp++) {
                System.out.print(" ");
            }
            for(int j=i; j<=2*i-1; j++)  {
                System.out.print(j);
            }
            for(int j=2*i-2; j>=i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }   
}

//   1
//  232
// 34543
//  232
//   1