
package Basic; 


public class MainMethod {
    
    String name = "Igor";
    int age = 29;
    
    void apresention() {
        System.out.println("My name is " + name +  " and i have " + age + " years old");
        
    }
    
    public static void main(String[] args) {
        
        MainMethod main = new MainMethod(); 
        
        main.apresention();
    }
} 