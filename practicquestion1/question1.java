package practicquestion1;

import java.util.Scanner;

public class question1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :"); 
        int a=sc.nextInt();
        System.out.print("Enter the second number :");
        int b=sc.nextInt();
        System.out.print("Enter the third number :");
        int c=sc.nextInt();
        sc.close();

        printAvarage(a, b, c);

    }

    public static double printAvarage(int a, int b, int c){
        double avarage=(a+b+c)/3;
        System.out.println(avarage);
        return avarage;
    }
}