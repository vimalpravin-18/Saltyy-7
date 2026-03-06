public class Frequency {
    public static void main(String[] args) {
        String s = "Vimal";
        
        for(int i=0; i<s.length(); i++) {

            int count =1;

            for(int j=i+1; j<s.length(); j++) {
                if(s.toLowerCase().charAt(i) == s.toLowerCase().charAt(j)) {
                    count++;
                }
            }
            System.out.println(s.charAt(i)+ " : "+ count+", ");
        }
    }
}

// v : 1
// i : 1
// m : 1
// a : 1
// l : 1
