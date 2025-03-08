package functions;

import java.util.Scanner;

public class factorial {

    public static void printFact(int n){
        if(n<0){
            System.out.println("invailid number");
            return;
        }
        int fact=1;
        while (n>=1){
            fact=fact*n;
            n--;        
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

       printFact(n);
        

    }
    
}
