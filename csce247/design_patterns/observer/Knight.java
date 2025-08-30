package observer;

public class Knight implements Observer //child of
{
    Knight(Subject watchman, Subject Greeter) //identical to shopowner just different options
    {
        if (watchman != null) 
        {
            watchman.registerObserver(this);
        }
        if (Greeter != null) 
        {
            Greeter.registerObserver(this);
        }
    }

    public void update(boolean warning, int note)
    {
        if(!warning) //greeter route
        {
            if(note ==1) //option 1
            {
                System.out.println("Knight: Meets the messenger and directs them to the castle.");
            }
            else if(note==2)
            {
                System.out.println("Knight: Gathers the chariot for a formal entry.");
            }
        }
        else //watchman route
        {
            if(note ==1)
            {
                System.out.println("Knight: Helps everyone get home safe.");
            }
            else if(note ==2)
            {
                System.out.println("Knight: Prepares for battle. RAHHHHH!!!!");
            }
        }
    }
}
