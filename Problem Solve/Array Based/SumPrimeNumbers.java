public class SumPrimeNumbers {
    public static int sumEndingWithDigit(int d) {
        int n = 50;

        int a = (d == 0) ? 10 : d;  // 10
        int l = a + (n - 1) * 10;  // 500

        return (n * (a + l)) / 2;  // 
    }

    public static void main(String[] args) {
        System.out.println(sumEndingWithDigit(3)); // test
    }
}