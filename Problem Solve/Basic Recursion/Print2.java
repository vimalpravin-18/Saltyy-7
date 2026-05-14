public class Print2 {
    static void print(int n, int i) {

        if(n<i) {
            return;
        }

        System.out.print(n+" ");
        print(n-1, i);
    
    }

    public static void main(String[] args) {
        print(5, 1);
    }
}
