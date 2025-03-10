package practicquestion1;

// Q.8=> Two numbers are entered by the user, x and n. Write a function to find the value
//       of one number raised to the power of another i.e. xn.


import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter x : ");
        int x=sc.nextInt();
        System.out.print("enter power of x : ");
        int n=sc.nextInt();

        calculatePower(x, n);
        sc.close();

    }

    public static void calculatePower(int x,int n){
        int v=1;
        while(n>0){
            v= v*x;
            n--;
        }
        System.out.println(v);
    }
    
}
