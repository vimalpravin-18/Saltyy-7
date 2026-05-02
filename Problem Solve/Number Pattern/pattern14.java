public class pattern14 {
    public void pattern(int n) {
        for(int i=0; i<=n; i++) {
            char ch = 'A';
            for(int j=0; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern14 sol = new pattern14();
        sol.pattern(4);
    }
 }
