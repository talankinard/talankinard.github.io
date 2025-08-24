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
    { //symbols for each character
        return new String[] { " __", "(--)" };
    }

    public String toString() 
    { //toString method
        return String.join("\n", asciiArt()) + "\n" + getRole() + ": " + getName(); //break for the sumbols and printing of the art
    }
}
