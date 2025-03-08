package functions;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        printTable(n);
    }

    public static void printTable(int n){
        for(int i=1;i<=10;i++){
            int table = n*i;
            System.out.println(table);
        }
    }
    
}
