public class ReversePyramid {
    public static void main(String[] args) {

        int n=5;

        for(int i=n; i>=1; i--) {

            for(int sp=1; sp<=n-i; sp++) {
                System.out.print(" ");
            }
             for(int j=1; j<=i; j++){
                System.out.print(j);
             }
             System.out.println();
        }
        
    }
}

//        1234
//         123  
//          12
//           1