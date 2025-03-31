package arrays;

import java.util.Scanner;

public class quest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        
        for(int i=0;i<size;i++){
            
            if(max<numbers[i]){
                max=numbers[i];
            }
            if(min>numbers[i]){
                min=numbers[i];
            }
        }

        System.out.println("maximum number is "+max+"   in this array");
        System.out.println("minimum number is "+min+" in this array");

        sc.close();
    }
    
}
