public class Vanilla extends ScoopDecorator//again same thing
{
    public Vanilla(IceCream iceCream, int numScoops)
    {
        super(iceCream,numScoops); //required for parents classes to pass it
    }

    protected String color()
    {
        return ANSI_WHITE; //vanilla color
    }
}
