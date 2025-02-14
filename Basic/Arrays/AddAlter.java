/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author User
 */

public class AddAlter {
    public static void main(String[] args) {
        
        int[] inicialArray = {1,2,3,4,5,6,123,8,9,100};
        int newNumber = 10; 
        
        
        inicialArray[6] = 7; 
        
        int[] newArray = new int[inicialArray.length + 1];
            
                    
            for (int i = 0; i < inicialArray.length; i++) {
            newArray[i] = inicialArray[i];
            
            newArray = inicialArray; 
            
            
            newArray[newArray.length - 1] = newNumber;
              
        }
             
       for(int novo : newArray) {         
           System.out.println(novo); 
       }
    }
}
