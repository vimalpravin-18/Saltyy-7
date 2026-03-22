public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(b);  // 10
        System.out.println(a);  // 20
    }
}
