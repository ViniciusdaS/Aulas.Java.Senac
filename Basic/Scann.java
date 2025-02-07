
package Basic;

import java.util.Scanner; 

public class Scann {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int number1, number2; 
        
        System.out.println("Type a number: ");
        number1 = scan.nextInt(); 
        
        System.out.println("Type other number: ");
        number2 = scan.nextInt(); 
        
        int result = number1 + number2;
        
        System.out.println("The result of som is " + result); 
        
        scan.close(); 
    }
}
