package practicquestion1;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number number : ");
        int n=sc.nextInt();
        sc.close();

        sumOdd(n);
        
    }

    public static void sumOdd(int n){
        int sum=0;
        while(n>=1){
            if(n%2!=0){
                sum=sum+n;
            }
            n--;
        }
        System.out.println("Sum of the odd numbers between 1-"+n+"is= "+sum);
    }
    
}
