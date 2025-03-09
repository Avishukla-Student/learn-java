package practicquestion1;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        
        printGreater(a, b);

    }

    public static void printGreater(int a,int b){
        if(a<b){
            System.out.println(b+" is greater then "+a);
        }else{
            System.out.println(a+" is greater then"+b);
        }
    }
    
}
