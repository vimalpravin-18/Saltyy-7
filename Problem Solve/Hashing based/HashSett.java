import java.util.HashSet;

public class HashSett {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Virat");    //methods :  add, remove , contains , isEmpty , size , clear . 
        set.add("Dhoni");
        set.add("Rohit");
        
        

        System.out.println(set.contains("Virat"));
        System.out.println(set.remove("Dhoni"));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.add("Dhoni");

        System.out.println(set.size());
    }
}