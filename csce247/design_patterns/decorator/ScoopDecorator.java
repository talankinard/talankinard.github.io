public abstract class ScoopDecorator extends IceCream
{
    protected IceCream iceCream;

    //colors given
    public static final String ANSI_BLUE =  "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";   

    public ScoopDecorator(IceCream iceCream, int numScoops) //constructor
    {
        this.iceCream =iceCream;
        
        //checks FOR valid
        if(numScoops < 0)
        {
            this.numScoops =0;
        }
        else
        {
            this.numScoops = numScoops;
        }

        addScoops();
        addBaseArt();
    }

    protected abstract String color();

    private void addScoops() //create the scop lines
    {
        int[] scoopWidths ={0,2,4,6,8,10}; //num of dashes or width 
        int scoopsToDraw;

        if(numScoops > scoopWidths.length)  //limits so doesnt go past array lengt
        {
            scoopsToDraw = scoopWidths.length;
        }
        else
        {
            scoopsToDraw = numScoops;
        }

        for(int i=0;i<scoopsToDraw;i++) //scoop lines
        {
            String dash = "-".repeat(scoopWidths[i]); //dashes draw
            String scoopLine="(" +dash+")"; //scoops and dashes
            asciiArt.add(color()+scoopLine+ANSI_RESET); //adds color
        }
    }

    private void addBaseArt() //takes lines from list and adds those
    {
        for(String line:iceCream.asciiArt)
        {
            asciiArt.add(line);
        }
    }
}
