package pattern;

//print this pattern.
//
// *        *
// **      **
// * *    * *
// *  *  *  *
// *   **   *
// *   **   *
// *  *  *  *
// * *    * *
// **      **
// *        *

public class pattern6 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                   System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
             for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
             for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                if(j==1||j==i){
                   System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                if(j==5||j==i){
                   System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                if(j==5||j==i){
                   System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        
    }
    
}
