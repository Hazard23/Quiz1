
package quiz1;
import java.util.Scanner;

public class Quiz1 {

    
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       
    System.out.println("Enter Your Name:");
    String MyName, MyPass;
            MyName = keyboard.next();
    System.out.println("Enter your password:");
    MyPass = keyboard.next();
        
       System.out.println ("Hello "  + MyName + "," + "Welcome to CSC200 class! and Your Password is " + MyPass);
        
        
       
      
 
    }
    
}
