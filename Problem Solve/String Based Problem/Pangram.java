import from java.utli.HashSet;

public class Pangram {
  public static void main(String []args ) {
      System.out.println(IsPangram("The quick brown fox jumps over the  lazy dog"));
  }

  public static Boolean IsPangram(String str) {
      str = str.toLowerCase();
      HashSet<Character> set = new HashSet<>();

      for(Char ch : str.toCharArray()) {
          if(Character.isLetter(ch) {
            set.add(ch);
          }
      }
  }
}
