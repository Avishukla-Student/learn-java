package pattern;

//print this pattern.
//      1
//     212
//    32123
//   4321234
//  543212345

public class pattern3 {
    public static void main(String[] args){
        
        for(int i=1; i<=5; i++){
           for(int j=5; j>=i; j--){
              System.out.print(" ");
           }
           
           for(int j=i; j>=1; j--){
               System.out.print(j);
           }
           for(int j=2; j<=i; j++){
               System.out.print(j);
           }
           
           System.out.println();
       }

    }
    
}
