public class V {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            for(int j=0; j<=13; j++) {
                if(i==0 && j==0 || i==1 && j==1 || i==2 && j==2 || i==3 && j==3 || i==4 && j==4 || i==5 && j==5 || i==6 && j==6 || i==6 && j==7 || i==5 && j==8 || i==4 && j==9 || i==3 && j==10 || i==2 && j==11 || i==1 && j==12 || i==0 && j==13) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
