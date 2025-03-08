package functions;

import java.util.Scanner;

public class funtcion1 {

    // public static void printName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // public static int printSum(int a,int b){
    //     int sum=a+b;
    //     return sum;
    // }

    public static int printProduct(int a, int b){
        int product=a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String name=sc.next();
        // printName(name);

        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();

        // int sum= printSum(a, b);
        // System.out.println("sum is  : "+ sum);
        
        System.out.println("product is : "+printProduct(a, b));
    }
    
}
