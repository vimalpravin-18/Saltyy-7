public class pattern21 {
    public void  patternn(int n) {
        for(int i=1; i<n; i++) {
            for(int j=1; j<n; j++) {
                if(i==n-1 || i==1 || j==n-1 || j==1) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern21 pt = new pattern21();
        pt.patternn(5);
    }
}

// ****
// *  *
// *  *
// ****