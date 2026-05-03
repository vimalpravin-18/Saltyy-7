public class pattern22 {
    public void pattern(int n) {

        for(int i=0; i<2*n-1; i++) {
            for(int j=0; j<2*n-1; j++) {
                
                int top=i;
                int bottom = (2*n-2)-i;
                int right = (2*n-2)-j;
                int left = j;

                int mindist = Math.min(Math.min(top, right), Math.min(left, bottom));

                System.out.print(n - mindist  + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern22 pt = new pattern22();
        pt.pattern(4);
    }
}


// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4 
// 4 3 2 2 2 3 4 
// 4 3 2 1 2 3 4 
// 4 3 2 2 2 3 4 
// 4 3 3 3 3 3 4 
// 4 4 4 4 4 4 4