package lecture3;
import java.util.*;

//check the number is prime or not

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        if(isPrime(num)){
            System.out.println("is a prime number");
        }else{
            System.out.println("is not a prime number");
        }
        
    };
    
    public static boolean isPrime(int num){
        if(num<1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i ==0){
                return true;
            }

        }
        return false;
    }
};
