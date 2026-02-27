public class Z {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            for(int j=0; j<7; j++) {
                if(i==0 || i==6 || i==1 && j==5 || i==2 && j==4 || i==3 && j==3 || i==4 &&  j==2 || i==5 && j==1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
}
