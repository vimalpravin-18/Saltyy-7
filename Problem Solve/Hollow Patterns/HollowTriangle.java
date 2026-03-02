public class HollowTriangle {
    public static void main(String[] args) {
        int n=10;
        for(int i=1; i<=n; i++) {

            for(int spaces=1; spaces<=n-i; spaces++) {
                System.out.print(" ");
            }
                for(int j=1; j<=2*i-1; j++) {
                    if(i==1|| i==n||j==1||j==2*i-1) { 
                    System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }
    }
}

//       *
//     *  *
//    *    *
//   *      *
//  **********
