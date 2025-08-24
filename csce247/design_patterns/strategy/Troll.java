package strategy;

public class Troll extends Character
{
    public Troll(String name)
    {
        super(name);
    }

    public String getRole()
    {
        return "Troll";
    }

    public String[] asciiArt() 
    {
        return new String[] 
        { 
        "//^\\" 
        };
    }

    public String toString() 
    {
        return String.join("\n", asciiArt()) + "\n" + getRole() + ": " + getName();
    }
}
