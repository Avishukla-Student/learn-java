package twoDarray;

import java.util.Scanner;

public class quest1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int clms=sc.nextInt();

        int array[][]=new int[rows][clms];

        for(int i=0;i<rows;i++){
            for(int j=0;j<clms;j++){
                array[i][j]=sc.nextInt();
            }
        }

        int x=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<clms;j++){
                if (array[i][j]==x) {
                    System.out.println("x is found on the index ="+i+","+j);
                } 
            }
        }
              
        sc.close();

    }
    
}
