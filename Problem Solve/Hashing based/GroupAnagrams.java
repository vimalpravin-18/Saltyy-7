import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){

            char[] arr = word.toCharArray();  
            Arrays.sort(arr);                       // sort the each word 
            String key = new String(arr);  

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());     // And checks the each words frequency
            }

            map.get(key).add(word);  // placed in a separated array list
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] words = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = groupAnagrams(words);

        System.out.println(result);
    }
}