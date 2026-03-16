public class CheckNum {

    public static boolean ContainsElement(int[] arr,int num) {
        for(int nums : arr) {
            if(nums == num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,5,6};
        int num = 9;
        System.out.println(ContainsElement(arr, num) + " ");

    }
}
