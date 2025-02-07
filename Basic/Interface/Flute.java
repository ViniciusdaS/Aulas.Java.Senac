
package Basic.Interface;

class Flute implements OrchestraFunctions{
    
    @Override
    public void play() {
        System.out.println("The flute is playing"); 
    }
    
    @Override
    public void tune() {
        System.out.println("The flute is tune"); 
    }
}
