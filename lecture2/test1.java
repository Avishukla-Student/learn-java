package lecture2;
import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        int operater= sc.nextInt();
        sc.close();

       switch (operater) {
        case 1:System.out.println(a+b);            
        break;
        case 2:System.out.println(a-b);
        break;
        case 3:System.out.println(a*b);
        break;
        case 4:if(b==0){
            System.out.println("invalid statement");
        }else{
            System.out.println(a/b);
        }
        break;
        case 5:if(b==0){
            System.out.println("invalid statement");
        }else{
            System.out.println(a%b);
        }
        default:System.out.println("invalid operater");
        
       };
    };
    
};
