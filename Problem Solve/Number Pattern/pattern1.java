public class pattern1 {
        public void pattern1(int N) {

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print("* ");
            }
                    System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1 sol = new pattern1();
        int N = 5; 
        sol.pattern1(N); 
    }
}