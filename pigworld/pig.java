// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class pig extends Actor
{

    /**
     * 
     */
    public void act()
    {
        moveAndTurn();
        eat();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
        if (isGameLost()) {
            transitionToGameLostWorld();
        }
    }

    /**
     * Act - do whatever the pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void moveAndTurn()
    {
        move(4);
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
        Greenfoot.setSpeed(50);
    }

    /**
     * Act - do whatever the pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void eat()
    {
        Actor burger = getOneIntersectingObject(burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
        }
    }

    /**
     * 
     */
    public boolean isGameWon()
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
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
    }

    /**
     * 
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
    public void transitionToGameLostWorld()
    {
        World gameLostWorld =  new GameLostWorld();
        Greenfoot.setWorld(gameLostWorld);
    }
}
