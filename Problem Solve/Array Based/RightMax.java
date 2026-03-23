public class RightMax {
    public static void main(String[] args) {
        int[] arr = {342,42,424,42,53,35,98};

        int max = arr[arr.length-1];
        System.out.print(max+" ");                 // COmpares with right side values and prints the 
                                                   // maximum value on the right side of the array

        for(int i=arr.length-2; i>=0; i--){

            if(arr[i]>max){
                max = arr[i];
                System.out.print(max+" ");
            }
        }
    }   
}
