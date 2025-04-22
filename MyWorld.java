import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Pig pig = new Pig();
        addObject(pig, 100, 100);
        
        Banana banana = new Banana();
        addObject(banana, 600, 100); 
    }
}
