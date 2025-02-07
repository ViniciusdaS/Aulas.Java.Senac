
package Basic.Interface;

class Piano implements OrchestraFunctions {
    
    @Override
    public void play() {
        System.out.println("The piano is playing"); 
    }
    
    @Override
    public void tune() {
        System.out.println("The piano is tune"); 
    }
}

