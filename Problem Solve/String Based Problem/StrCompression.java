public class StrCompression {
    public static void main(String[] args) {
        String words = "aabbbc";
        int count = 0;

        for(int i=0; i<words.length(); i++ ) {
            
            if(i < words.length()-1 && words.charAt(i) == words.charAt(i+1)) {
                count++;
                } else {
                    System.out.print(words.charAt(i)+""+count+" ");
                    count = 1;
                }
         }
         System.out.println();
    }
}

// a1 b3 c1