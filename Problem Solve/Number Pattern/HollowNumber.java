import java.util.Scanner;

public class HollowNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {

                if(i == 1 ) {
                    System.out.print(j + " ");
                } 
                
                else if(i == n) {
                    System.out.print((n - j + 1) + " ");
                } 
                
                else if( j == 1) {
                    System.out.print(i + " ");
                }

                else if( j == n) {
                    System.out.print((n-i+1)+" ");
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}



//   1 2 3 4 5
//   2       4 
//   3       3
//   4       2
//   5 4 3 2 1