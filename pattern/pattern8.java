package pattern;

//print this pattern.
//
//      1 
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1

public class pattern8 {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
               System.out.print(" ");
           }
           int a=1;
           for(int j=0;j<=i;j++){
               System.out.print(a+" ");
               a=a*(i-j)/(j+1);                     
           }
            System.out.println();
        }
    }

    
}
