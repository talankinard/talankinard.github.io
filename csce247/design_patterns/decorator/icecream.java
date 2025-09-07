import java.util.ArrayList;

public abstract class IceCream 
{
    //uml given
    protected ArrayList<String> asciiArt = new ArrayList<>();
    protected int numScoops;

    public String toString() 
    {
        //string to hold
        String result = "";
        for (String line : asciiArt) 
        {
            result += line + "\n"; //add and move to next line
        }
        return result; //return the drawing
    }
}

