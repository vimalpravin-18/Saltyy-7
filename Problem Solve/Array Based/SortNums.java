public class SortNums {
    public static void SortNumbers(int[] arr) {
        int low = 0, mid = 0, high = arr.length -1;

        while(mid <= high) {

            if(arr[mid] == 0) {

                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;                // stores the 0`s and move to next index

                low++;
                mid++;
            } 
            
            else if(arr[mid] == 1) {                // it leaves as it is , if the value is 1
                mid++;
            } 
            
            else {

               int temp = arr[mid];                  // Assigns the swapped values in end , and decrease the index .
               arr[mid] = arr[high];
               arr[high] = temp;

               high--;
            }
        }
    }

    public static void main(String[] args) {
        int[]  arr = {4,1,2,1,1,2,0};                      // Time complexity  - O(n) 
        SortNumbers(arr);                               

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
