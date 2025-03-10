package practicquestion1;

// wrong program.

import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number : ");
        int a=sc.nextInt();
        System.out.print("enter second number : ");
        int b=sc.nextInt();
        int i=2;
        sc.close();

        if(b<=a){
            
            while (i<=b) {
               
                if(a%i==0 && b%i==0){
                    if(i>i--){
                        System.out.println(i);
                        return;
                    }                    
                }
                else {
                    System.out.println("no comman divisior");
                   return;
                }
                i++;
                
            }

            // if(true){
                
            // }else{
                
            // }
        }
        else{
            
            while (i<=a) {
                
                if(a%i==0 && b%i==0){
                    if(i>i--){
                        System.out.println(i);
                        return ;
                    }
                }
                else{
                    System.out.println("no comman divisior");
                    return ;
                }
                i++;
                
            }
            // if(true){
            //     System.out.println(i);
            // }else{
            //     System.out.println("no comman divisior");
            // }

        }

    }

    
    
}
