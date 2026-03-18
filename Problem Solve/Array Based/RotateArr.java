public class RotateArr {
    public static void rotate(int[] arr, int k){

    k = k % arr.length;

    reverse(arr, 0, arr.length - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, arr.length - 1);
}

public static void reverse(int[] arr, int start, int end){
    while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }

    
}
public static void main(String[] args) {
    int[] arr = {3,45,6,77,3,2};

    System.out.println(rotate(arr, 7));
    System.out.println(reverse(arr, 4, 6));
}
}
