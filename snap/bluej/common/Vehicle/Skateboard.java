
/**
 * Write a description of class Skateboard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Skateboard extends Vehicle {
    private int scratches;
    private boolean needsPolish;
    public boolean addScratch() {
        scratches++;
        if(scratches > 10) {
            needsPolish=true;
        }
        return needsPolish;
    }
    
    public void polish() {
        scratches = 0;
        needsPolish = false;
    }
    
    public Skateboard(String name, double speed){
        super(name, speed);
    }
}
