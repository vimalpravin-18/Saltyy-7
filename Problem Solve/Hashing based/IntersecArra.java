import java.util.HashSet;;

public class IntersecArra {

    public static int[] CommonElements(int[] arr1,int[] arr2) {
        
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num : arr1) {
            set.add(num);        
        }

        for(int num : arr2) {
            if(set.contains(num)) {
                result.add(num);
            }
        }

        int[] arr = new int[result.size()];
        int i=0; 
                                                    // time complexity = >  O(n + m)

        for(int num : result) {
            arr[i++] = num;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,2};

        int[] result = CommonElements(arr1, arr2);
        for(int num : result) {
            System.out.println(num + " ");
        }
     }
}

