// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class snake extends Actor
{

    /**
     * 
     */
    public snake()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        if (isGameLost()) {
            transitionToGameLostWorld();
        }
    }

    /**
     * Make the current world, the GameWonWorld!
     */
    public void transitionToGameLostWorld()
    {
        World gameLostWorld =  new GameLostWorld();
        Greenfoot.setWorld(gameLostWorld);
    }

    /**
     * When the list of burger objects in the world is empty, we win the game!
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor pig = getOneIntersectingObject(pig.class);
        if (pig != null) {
            World world = getWorld();
            world.removeObject(pig);
        }
    }
}
