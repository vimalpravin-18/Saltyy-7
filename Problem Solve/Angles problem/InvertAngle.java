public class InvertAngle {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            for(int j=0; j<7; j++) {
                if(j==0 || i==0 || i==1 && j==5 || i==2 && j==4 || i==3 && j==3 || i==4 && j==2  || i==5 && j==1  || i==6 && j==0 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
