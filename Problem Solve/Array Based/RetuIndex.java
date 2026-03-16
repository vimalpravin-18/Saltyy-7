public class RetuIndex {
    public static int ReturnIndex(int[] arr, int n) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == n) {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = 50;

        System.out.println(ReturnIndex(arr, n));
    }
}