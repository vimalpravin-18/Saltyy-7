public class OccurFre {
    public static int CountFre(int[] arr, int n) {
        int count =0;
        for(int num : arr) {
            if(n == num) {
              count++; 
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,2,4};
        int n= 1;

        System.out.println(CountFre(arr, n));
    }
}   
