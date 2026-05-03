public class pattern18 {
    public void pattern(int n) {


        for(int i=0; i<n; i++) {
            
            for(char ch = (char) ('A' + n - i - 1); ch <= (char) ('A' + n - 1); ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        pattern18 pt = new pattern18();
        pt.pattern(5);
    }
}
