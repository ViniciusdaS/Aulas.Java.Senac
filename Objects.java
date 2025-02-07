
package Basic;

public class Objects {
    
    String name = "Vinicius";
    int age = 18;
    
    public Objects(String name, int age) {
        this.name = name; 
        this.age = age; 

        
    }
    
    void Info() {
        System.out.println("Name: " + name + " Age: " + age);
    }
    
    public static void main(String[] args) {
       
        Objects obj = new Objects("Victor", 20);
        
        obj.Info();
    }

}

