public class SimpleHollow {
    public static void main(String[] args) {
        int n = 9;
        
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=n; j++) {
                if(i==0 || i==n || j==0 || j==n) {
                    System.out.print(n/n+" ");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}

//  1 1 1 1 1
//  1       1
//  1       1
//  1       1
//  1 1 1 1 1
