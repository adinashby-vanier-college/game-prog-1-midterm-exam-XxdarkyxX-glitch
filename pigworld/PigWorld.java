// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class PigWorld.
     */
    public PigWorld()
    {
        super(900, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        burger burger =  new burger();
        addObject(burger, 798, 92);
        burger burger2 =  new burger();
        addObject(burger2, 55, 46);
        burger burger3 =  new burger();
        addObject(burger3, 567, 139);
        burger burger4 =  new burger();
        addObject(burger4, 708, 347);
        burger burger5 =  new burger();
        addObject(burger5, 59, 478);
        burger burger6 =  new burger();
        addObject(burger6, 96, 232);
        burger burger7 =  new burger();
        addObject(burger7, 351, 494);
        pig pig =  new pig();
        addObject(pig, 355, 314);
        snake snake =  new snake();
        addObject(snake, 873, 572);
    }
}
