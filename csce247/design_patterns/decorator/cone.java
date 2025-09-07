import java.util.ArrayList;
public class Cone extends IceCream //child
{
    private static final String ANSI_BROWN = "\u001B[38;5;130m"; //given
    private static final String ANSI_RESET = "\u001B[0m";

    public Cone()
    {
        ArrayList<String> coneLines = FileReader.getLines("cone.txt"); //load code from txt file

        for(String line: coneLines)
        {
            asciiArt.add(ANSI_BROWN+line+ANSI_RESET); //adds each line w brown cone coloring
        }

        numScoops = 0;
    }
}
