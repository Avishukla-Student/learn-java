package practicquestion1;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        int r=sc.nextInt();
        sc.close();
        calculateArea(r);
    }

    public static void calculateArea(int r){
        double pi=3.14;
        double area=2*pi*r;
        System.out.println("cricumference of circle = "+area);
    }
    
}
