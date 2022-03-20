
package assignment1;
import java.util.*;

public class doWhile {
    public static void main (String []args){
     int i =0; 
        
      do {
    
    i++;
    
    System.out.println("Please Enter Intake Month.");
    
    int intakeMonth;
    Scanner input=new Scanner(System.in);
    intakeMonth= input.nextInt();
    
    whileTest test=new whileTest();
    
   System.out.println("Your intake is " + test.intake()); 
}while (i<1);
}  
        
    }
    

package assignment1;
//import java.util.*;

public class whileTest {
    
    public String intake(){
     int a=0;
     a++;     
        while(a<3){
            System.out.println("Valid Intake.");
            
    } System.out.println ("Invalid intake.");
        return null;
     
}
    
}
