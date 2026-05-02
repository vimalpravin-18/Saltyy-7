public class pattern15 {
    public void pattern(int n) {

        for(int i=n; i>=1; i--) {
            char ch = 'A';

            for(int j=1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern15 sol = new pattern15();
        sol.pattern(5);
    }
}
