package twoDarray;

import java.util.Scanner;

public class simple {
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

        
        for(int i=0;i<rows;i++){
            for(int j=0;j<clms;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
