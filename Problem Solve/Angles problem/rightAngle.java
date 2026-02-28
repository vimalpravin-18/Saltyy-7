public class rightAngle {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            for(int j=0; j<12; j++) {
                if(j==0|| i==6|| j==2 && i==1|| j==4 && i==2 || j==6 && i==3 || j==8 && i==4|| j==10 && i==5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
