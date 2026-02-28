public class FloydsTriangle {
    public static void main(String[] args) {
        // for(int i=0; i<5; i++) {
        //     for(int j=0; j<5; j++) {
        //         if(j==0 || i==4 || j==1 && i!=0 || j==2 && i!=0 && i!=1 || j==3 && i!=2 && i!=0 && i!=1 ||j==4 && i!=2 && i!=0 && i!=1 && i!=3 ) {
        //             System.out.print(i +" ");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // 0
        // 1 1 
        // 2 2 2 
        // 3 3 3 3 
        // 4 4 4 4 4 

        int n= 3; 
        int num =1 ;

        for(int i=0; i<=n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(num + " "); 
                 num++;
            }
            System.out.println(); 
        } 
    }
} 

// this is a floyds triangle

// 1
// 2 3
// 4 5 6
// 7 8 9 10




