public class Strawberry extends ScoopDecorator //same thing as blueberyy 
{
    
    public Strawberry(IceCream iceCream, int numScoops)
    {
        super(iceCream,numScoops); //required for parents classes to pass it
    }

    protected String color()
    {
        return ANSI_RED; //strawberry color (best flavor)
    }
}
