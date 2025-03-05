package patterns;

//print this pattern
//
//1
//0 1
//0 1 0
//1 0 1 0
//1 0 1 0 1

public class ninethpattern {
    
    public static void main(String[] args) {
        boolean a=true;
        for(int i=1;i<=5;i++){
           
           for(int j=1;j<=i;j++){
               if(a){
                System.out.print("1 ");
                a=false;
               }else{
                System.out.print("0 ");
                a=true;
               }
           }
           System.out.println();
        }
    }
    
}
