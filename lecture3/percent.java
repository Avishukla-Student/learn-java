package lecture3;
import java.util.*;

public class percent {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a==0){
            System.out.println("Stop");
        }else if(a==1){
            System.out.print("enter marks in parcentage(%)");
            int marks=sc.nextInt();
            if(marks>=90){
                System.out.println("Marks is good");
            }else if(marks>=60){
                System.out.println("Marks is also good");
            }else{
                System.out.println("Marks is good as well");
            }
        }else{
            System.out.println("enter only 1 and 0");
        }
    }
    
}
