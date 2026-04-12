public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(RemoveChar("Hello, World!", 'l'));
    }

    public static String RemoveChar(String str , char ch) {
        String result = " ";

        for(char c : str.toCharArray()) {
            if(c != ch) {
                result += c;
            }
        }
        return result;
    }
}

// Remove the character 

// Heo, Word!
