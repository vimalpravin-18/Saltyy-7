import java.util.*;

public class NonNegative {
    public static void main(String[] args) {
        int[] arr = {-21,3,5,-5,6,7,-78,9};
        int[] newarr = new int[arr.length];

        rearrange(arr);
        Print(arr);
    }

    public static void Print(int[] arr) {
        for(int inum : arr) {
            System.out.print(inum);
            System.out.print(" ");
        }
    }

    public static void rearrange(int[] arr){

    int j = 0;

    for(int i = 0; i < arr.length; i++){

        if(arr[i] < 0){

            int temp = arr[i]; // == =5
            arr[i] = arr[j];  //  arr[3] = 3
            arr[j] = temp;    // arr[1] = -5

            j++;
        }
    }
    }
}
