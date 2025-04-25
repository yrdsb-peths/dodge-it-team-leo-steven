import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pig extends Actor
{
    boolean atTop = true;
    
    public Pig() {
        setImage("images/pig.png");
    }
    public void act()
    {    
    if(Greenfoot.mouseClicked(null))
        {
            atTop =  !atTop;
        }
    if (atTop)
        {
            setLocation(100, 100);
        }
    else 
        {
            setLocation(100,300);
        }
    }
}
