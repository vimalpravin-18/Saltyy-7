// Updating the Array , inserting a element in specific position

public class UpdateArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println(arr);
        arr[2] = 30;

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
