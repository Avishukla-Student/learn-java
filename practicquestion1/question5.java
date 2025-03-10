package practicquestion1;

// Q.5=> Write a function that takes in age as input and returns if that person
//       is eligible to vote or not. A person of age > 18 is eligible to vote.


import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age=sc.nextInt();
        sc.close();

        printVote(age);

    }

    public static void printVote(int age){
        if(age<18){
            System.out.println("you can not vote ");
        }else{
            System.out.println("you can vote");
        }
    }
    
}
