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
        ArrayList <Integer> listID = new ArrayList<>();
        
        int id1 = 1; 
        int id2 = 2; 
        int id3 = 3;
        int id4 = 4; 
        int id5 = 5; 
        
        listNames.add(id1 + ": Kevin");
        listNames.add(id2 + ": Bartolomeu");
        listNames.add(id3 + ": Victor");
        listNames.add(id4 + ": Joaquina"); 
        listNames.add(id5 + ": Claudia");
        
        for(String id : listNames) {
            System.out.println("List of students of fundamental"); 
            System.out.println(id); 
        }

      } 
        
    }
    

