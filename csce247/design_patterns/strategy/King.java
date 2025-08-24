package strategy;

public class King extends Character 
{
    /*
     * extends from parent class
     */
    public King(String name)
    {
        super(name);
    }


    public String getRole()
    {
        return "Knight";
    }

    /*
     * king ascii art joint with the toString with a break to show hte symbol
     */
    public String[] asciiArt() 
    {
        return new String[] 
        { 
        "__/^^^\\__" 
        };
    }

    public String toString() 
    {
        return String.join("\n", asciiArt()) + "\n" + getRole() + ": " + getName();
    }
}
