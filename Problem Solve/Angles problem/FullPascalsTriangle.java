import java.util.Scanner;

public class FullPascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // Print spaces
            for (int space = 0; space < n - i; space++) {
                System.out.print("   ");
            }

            int num = 1;

            // Print numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "     ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}

// Pascals Triangle

   //                     1
     //               1       1               < -- add this and prints next , 1 + 1 = 2
 //                1       2       1                two prints .. 
//             1       3       3       1
//         1       4       6       4       1           --> addition of upper elements , prints down for each element
//      1      5      10      10       5       1