/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author User
 */
public class CriarArray {
    public static void main(String[] args) {
        
        int[] valuesInt = {1,2,3,4,5};
        String[] valuesString = {"Um", "Dois", "Tres", "Quatro", "Cinco"};
        
        for(int Int : valuesInt) {
            System.out.println(Int);
        
        }
        
        for(String string : valuesString) {
            System.out.println(string); 
        }
    }
}
