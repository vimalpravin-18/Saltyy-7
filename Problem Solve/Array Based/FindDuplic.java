import java.util.*;
public class FindDuplic {

public static void findDuplicates(int[] arr){

    HashSet<Integer> set = new HashSet<>();
    HashSet<Integer> duplicates = new HashSet<>();

    for(int num : arr){
        if(!set.add(num)){
            duplicates.add(num);
        }
    }

    System.out.println(duplicates);
}
}