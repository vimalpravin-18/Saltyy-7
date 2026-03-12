import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,4,5,3,6,8,7,8};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            if(set.contains(num)) {
                System.out.println("Duplicate : "+num);
            } else {
                set.add(num);
            }
        }
        
    }
}
