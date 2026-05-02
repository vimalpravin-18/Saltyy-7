public class pattern16 {
    public void pattern(int n) {

        char ch = 'A';
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        pattern16 sol = new pattern16();
        sol.pattern(5);
    }
}
