public class HollowRow {
    public static void main(String[] args) {
        int n=9;

        for(int i=1; i<=n; i++) {

            for(int j=1; j<=n; j++) {

                if (i==1 ) {
                    System.out.print(n/n+" ");
                 } 
                 
                 else if (i==n) {
                    System.out.print(n+" ");
                } 
                
                else if (j==1 || j==n) {
                    System.out.print(i+" ");
                } 
                
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


//  1 1 1 1 1
//  2       2
//  3       3
//  4       4
//  5 5 5 5 5