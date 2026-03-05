public class DuplicateStr {
    public static void main(String[] args) {
        String name = " Vimal Pravin";

        for(int i=0; i<name.length(); i++) {
            Boolean duplicate = false;

            for(int j=i+1; j<name.length(); j++) {
              if(name.charAt(i) == name.charAt(j)) {
                duplicate = true;
                break;
              }  
            }
            if(!duplicate) {
                System.out.print(name.charAt(i));
            }
        }
    }   
}

//   vml Pravin