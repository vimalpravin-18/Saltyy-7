public class R {
    public static void main(String[] args) {
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                if(j==0|| i==0 && j!=6 && j!=7 || i==1&& j==6 || i==2 && j==6 || i==3 && j==6 || i==4 && j!=6 && j!=7 && j!=1|| i==5 && j==2 || i==6 && j==4 || i==7 && j==6 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } 
            System.out.println();
        }

    }
}
