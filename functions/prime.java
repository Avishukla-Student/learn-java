package functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        if(printPrime(n)){
            System.out.println("number is not prime number");
        }else{
            System.out.println("number is  prime number");
        }
        
    }

    public static boolean printPrime(int n){
        if(n<1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }
    
}
