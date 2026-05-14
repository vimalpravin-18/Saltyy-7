public class print4 {
    static void print(int i, int n) {

        if(i>n) {
            return;
        }

        System.out.println(i);
        print(i + 2, n);
    }

    public static void main(String[] args) {
        print(2, 20);
    }
}
