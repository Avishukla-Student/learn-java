package lecture2;
import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();
        sc.close();

        // if(button==1){
        //     System.out.println("hello java");
        // }else if(button==2){
        //     System.out.println("namste");
        // }else if(button==3){
        //     System.out.println("bye bye");
        // }else{
        //     System.out.println("tata");
        // }

        switch (button) {
            case 1: System.out.println("hello"); 
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("bye bye");
            break;        
            default:System.out.println("Tata");
               
        }

    }
    
}
