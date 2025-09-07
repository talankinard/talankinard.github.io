public class BlueBerry extends ScoopDecorator //child
{
    
    public BlueBerry(IceCream iceCream, int numScoops)
    {
        super(iceCream,numScoops); //required for parents classes to pass it
    }

    protected String color()
    {
        return ANSI_BLUE; //BLUEberry color
    }
}