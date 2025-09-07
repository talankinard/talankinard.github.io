import java.util.ArrayList;
import java.util.List;

public abstract class ScoopDecorator extends IceCream
{
    //uml
    protected IceCream iceCream;

    // Flavor colors
    public static final String ANSI_BLUE  = "\u001B[34m";
    public static final String ANSI_RED   = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    // Max width for the bottom scoop
    private static final int MAX_DASHES = 10;

    public ScoopDecorator(IceCream iceCream, int numScoops)
    {
        this.iceCream = iceCream;

        // Make sure scoops are between 0 and 6
        this.numScoops = Math.max(0, Math.min(6, numScoops));

        // Copy the  art 
        this.asciiArt = new ArrayList<>(iceCream.asciiArt);

        // Add scoops for this flavor under the current top
        for (int i = 0; i < this.numScoops; i++)
        {
            addScoop(colorCode());
        }

        // Fix dash counts and put the cap on top
        adjustScoops();
    }

    
    protected abstract String colorCode(); // Each flavor class will return its own color

    private void addScoop(String color)
    {
        int insertAt = findTopInsertIndex();
        String scoop = color + centerText("(--)", MAX_DASHES) + ANSI_RESET;
        this.asciiArt.add(insertAt, scoop);
    }

    // Adjust dash counts and make sur there is only one cap at the top
    private void adjustScoops()
    {
        int coneTop = findConeTopIndex();
        if (coneTop < 0)
        {
            coneTop = this.asciiArt.size();
        }

        // Find the indexes of all scoops in asciiArt
        List<Integer> scoopLines = new ArrayList<>();
        for (int i = 0; i < coneTop; i++)
        {
            String plainText = removeColor(this.asciiArt.get(i)).trim();
            if (plainText.contains("-") || plainText.equals("()"))
            {
                scoopLines.add(i);
            }
        }

        int totalScoops = scoopLines.size();
        boolean capPlaced = false; // only one cap allowed

        // Go through each scoop from top to bottom
        for (int i = 0; i < totalScoops; i++)
        {
            int lineIndex = scoopLines.get(i);
            String original = this.asciiArt.get(lineIndex);
            String color = getColorCode(original);

            if (!capPlaced)
            {
                // First scoop at the very top is the cap "()"
                this.asciiArt.set(lineIndex, color + centerText("()", MAX_DASHES) + ANSI_RESET);
                capPlaced = true;
            }
            else
            {
                // Dash count gets smaller as you go up
                int dashCount = MAX_DASHES - 2 * (totalScoops - 1 - i);
                dashCount = Math.max(1, dashCount);
                this.asciiArt.set(lineIndex, color + centerText("(" + repeatChar('-', dashCount) + ")", MAX_DASHES) + ANSI_RESET);
            }
        }
    }

    
    private int getConeIndent() // find how far in from the left the cone starts
    {
        int coneTop = findConeTopIndex();
        if (coneTop >= 0)
        {
            return countLeadingSpaces(removeColor(this.asciiArt.get(coneTop)));
        }
        return 0;
    }

    // Center text to match the cone width
    private String centerText(String text, int dashWidth)
    {
        int totalWidth = dashWidth + 2; // () plus dashes
        int leftPad = (totalWidth - text.length()) / 2;
        StringBuilder sb = new StringBuilder();
        sb.append(repeatChar(' ', getConeIndent()));
        sb.append(repeatChar(' ', leftPad));
        sb.append(text);
        return sb.toString();
    }

    // Find where the cone art starts
    private int findConeTopIndex()
    {
        for (int i = 0; i < this.asciiArt.size(); i++)
        {
            String s = removeColor(this.asciiArt.get(i));
            if (s.contains("V"))
            {
                return i;
            }
        }
        return -1;
    }

    // Find where to insert a new scoop at the top
    private int findTopInsertIndex()
    {
        int i = 0;
        while (i < this.asciiArt.size())
        {
            String plain = removeColor(this.asciiArt.get(i)).trim();
            if (!plain.equals("()") && !plain.contains("V") && plain.length() > 0)
            {
                break;
            }
            i++;
        }
        return i;
    }

    // Get any ANSI color code at the start of a string
    private String getColorCode(String s)
    {
        if (s.startsWith("\u001B"))
        {
            int mIndex = s.indexOf('m');
            if (mIndex >= 0)
            {
                return s.substring(0, mIndex + 1);
            }
        }
        return "";
    }

    // Remove ANSI color codes from a string
    private String removeColor(String s)
    {
        return s.replaceAll("\\u001B\\[[;\\d]*m", "");
    }

    // Count how many spaces are at the start of a string
    private int countLeadingSpaces(String s)
    {
        int n = 0;
        while (n < s.length() && s.charAt(n) == ' ')
        {
            n++;
        }
        return n;
    }

    // Repeat a character a certain number of times
    private String repeatChar(char c, int n)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}
