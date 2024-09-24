// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameLostWorld extends World
{

    /**
     * Constructor for objects of class GameLostWorld.
     */
    public GameLostWorld()
    {
        super(600, 400, 1);
        showText("How did you die", 300, 150);
    }

    /**
     * 
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
        showTextWithBigBlackFont("You lose better luck next time", 180, 200);
    }

    /**
     * Make the current world, the GameWonWorld!
     */
    public void transitionToGameLostWorld()
    {
        World gameLostWorld =  new GameLostWorld();
        Greenfoot.setWorld(gameLostWorld);
    }
}
