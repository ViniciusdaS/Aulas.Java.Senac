
package Basic.Interface;

public class Orchestra {
    public static void main(String[] args) {
        
        OrchestraFunctions guitar = new Guitar(); 
        OrchestraFunctions piano = new Piano(); 
        OrchestraFunctions flute = new Flute(); 
        
        guitar.play();
        piano.play();
        flute.play();
        
        System.out.println("Pause...");
        
        guitar.tune();
        piano.tune();
        flute.tune();
        
        System.out.println("Play again...");
        
        guitar.play();
        piano.play();
        flute.play();
    }
}
