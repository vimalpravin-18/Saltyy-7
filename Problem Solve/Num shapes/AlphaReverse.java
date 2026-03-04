public class AlphaReverse {
    public static void main(String[] args) {
        int n=5;

        for(int i=n; i>=1; i--) {
            char ch = (char) ('A' + i-1);
            for(int j=1; j<=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}

// E F G H I 
// D E F G
// C D E
// B C
// A