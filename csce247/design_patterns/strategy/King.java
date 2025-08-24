package strategy;

public class King extends Character //extends as it is a child class
{
    public King(String name)
    {
        super(name);
    }


    public String getRole()
    {
        return "Knight";
    }

    public String[] asciiArt() 
    {
        return new String[] 
        { 
        "__//^^^\\__" 
        };
    }

    public String toString() 
    {
        return String.join("\n", asciiArt()) + "\n" + getRole() + ": " + getName();
    }
}
