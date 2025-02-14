/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

/**
 *
 * @author User
 */

import java.util.ArrayList; 

public class ListStudents {
    public static void main(String[] args) {
        
        ArrayList <String> listNames = new ArrayList<>();

        
        int id1 = 1; 
        int id2 = 2; 
        int id3 = 3;
        int id4 = 4; 
        int id5 = 5; 
        int id6 = 6; 
        
        listNames.add(id1 + ": Kevin");
        listNames.add(id2 + ": Bartolomeu");
        listNames.add(id3 + ": Victor");
        listNames.add(id4 + ": Joaquina"); 
        listNames.add(id5 + ": Claudia");
        listNames.add(id6 + "Gabriel");
        
        listNames.remove(5); 
        
        System.out.println("Students list of fundamental"); 
        
        for(String list : listNames) {
            System.out.println(list); 
        } 

      } 
   }
    

