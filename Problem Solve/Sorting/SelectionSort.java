import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void Selection(int arr[]) {

    int n = arr.length;

        for(int i=0; i<n-1; i++) {
            int minIndex = i;

            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After Sorting : ");
        for(int num :arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,2,34,2};


        System.out.println("Before Sorting : ");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        Selection(arr);

    }

}
