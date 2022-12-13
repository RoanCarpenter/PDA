

public class Bike extends Vehicle
{
    private boolean flatTire;
    
    public void ranOverNail() {
        flatTire = true;
    }
    
    public void fixTire() {
        flatTire = false; 
    }
    
    public Bike(String name, double speed){
        super(name, speed);
    }
}
