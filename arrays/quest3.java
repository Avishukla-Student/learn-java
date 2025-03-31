package arrays;

import java.util.Scanner;

public class quest3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        

        int array[]=new int[size];

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        boolean isassending=true;

        for(int i=0;i<size-1;i++){
            if(array[i]>array[i+1]){
                isassending=false;
            }
        }

        if(isassending){
            System.out.println("array is assanding");
        }else{
            System.out.println("array is not assending");
        }

        sc.close();
    }
    
}
