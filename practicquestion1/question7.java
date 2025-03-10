package practicquestion1;

// Q.7=> Write a program to enter the numbers till the user wants and at the end it should 
//       display the count of positive, negative and zeros entered. 

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        int n;
          
        System.out.println("enter numbers(if you do not want input any number then enter any character) ");
        while(true){
    
            if(!sc.hasNextInt()){
                break;
            }
            n=sc.nextInt();

            if(n>0){
                positiveCount++;
            }else if(n<0){
                negativeCount++;
            }else{
                zeroCount++;
            }

            // choice=sc.next().charAt(0);

        }

        System.out.println(" Summary");
        System.out.println("Total positive number = "+positiveCount);
        System.out.println("Total negative number = "+negativeCount);
        System.out.println("Total zero is = "+zeroCount);

        sc.close();
    }

    
    
}
