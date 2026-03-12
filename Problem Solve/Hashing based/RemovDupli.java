import java.util.HashSet;

public class RemovDupli {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,3};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
                set.add(num);
        }
        System.out.println(set);
    }
}