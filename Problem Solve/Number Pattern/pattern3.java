class pattern {
    public void pattern4(int N) {
        for (int i = 1; i <= N; i++) {
        
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

public class pattern3 {
    public static void main(String[] args) {
        pattern sol = new pattern();

        int N = 5;

        sol.pattern4(N);
    }
}
