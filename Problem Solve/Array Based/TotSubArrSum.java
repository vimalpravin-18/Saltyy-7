public class TotSubArrSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                for (int k = i; k <= j; k++) {
                    totalSum += arr[k];
                }
            }
        }
        System.out.println("Total sum of all subarrays is: " + totalSum);
    }
}