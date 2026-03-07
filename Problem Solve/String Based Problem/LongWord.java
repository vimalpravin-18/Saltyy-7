public class LongWord {
    public static void main(String[] args) {
        String s = " java is a languageite programming ";

        String[] words = s.split(" ");
        String longest ="";

        for(String word : words) {
            if(word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Longest : "+ longest);
    }
}