package pattern;

//print this pattern.

//      1 
//     1 2
//    1 2 3
//   1 2 3 4
//  1 2 3 4 5

public class pattern9 {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
