
package Basic.Interface;

class Guitar implements OrchestraFunctions{
    
    @Override
    public void play() {
        System.out.println("The guitar is playing"); 
        
    }
    
    @Override
    public void tune() {
        System.out.println("The guitar is tune"); 
    }
}
