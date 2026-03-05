public class CountVowels {
    public static void main(String[] args) {
        String name = "dark is not darking";
        int vowels =0 ;
        int  consonents = 0;
        

        for(int i=0; i<name.length(); i++) {
            char ch = name.charAt(i);

            if(ch=='a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u') {
                vowels++;
            } else {
                consonents++;
            }   
        }
        System.out.println("Vowels : "+ vowels);
        System.out.println("Consonents : "+consonents);
    }
}

// vowels : 5
// consonents : 14
