public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,4,4,4,4,4,4,2,4,2,3,2,2,2,4};

        System.out.println("Majority element is : "+Majority(arr));
    }

    public static int Majority(int[] arr) {

        int candidate = 0;  
        int count = 0;

        for(int num : arr) {
            if(count == 0) {
                candidate = num;
            }

            if(num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
