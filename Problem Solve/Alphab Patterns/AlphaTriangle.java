public class AlphaTriangle {
    public static void main(String[] args) {
        int n=5; 

        for(int i=1; i<=5; i++) {
            char ch = 'a';
            for(int j=1; j<=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
   

// a
// a b
// a b c
// a b c d
// a b c d e


// Alpha continuos Triangle 

int num = 5;
char ch = 'A';

for(int i=1; i<=num; i++) {

        for(int j=1 ; j<=i; j++) {
            System.out.print(ch+" ");
                    ch++;
        }

        System.out.println();
    }
  }
}

// A
// B C
// D E F
// G H I J
// K L M N O