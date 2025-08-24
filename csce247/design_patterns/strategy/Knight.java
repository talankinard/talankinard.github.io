package strategy;

public class Knight extends Character
{
    public Knight (String name)
    {
        super(name);
    }

    public String getRole()
    {
        return "Knight";
    }

    public String[] asciiArt() 
    { 
        return new String[] { " __", "(--)" };
        /*
         * symbol for knight
         */
    }

    public String toString() 
    { 
        /*
         * toString method with \n to break
         */
        return String.join("\n", asciiArt()) + "\n" + getRole() + ": " + getName(); 
    }
}
