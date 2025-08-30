package observer;

public class ShopOwner implements Observer //child of
{
    ShopOwner(Subject watchman, Subject Greeter)
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
                System.out.println("Shop Owner: Add finest displays in shop window to attract the messenger's attention.");
            }
            else if(note==2)
            {
                System.out.println("Shop Owner: Makes way for a formal greeting on the street.");
            }
        }
        else //watchman route
        {
            if(note ==1)
            {
                System.out.println("Shop Owner: Closes down shop and heads home.");
            }
            else if(note ==2)
            {
                System.out.println("Shop Owner: Drops everything and finds the nearest hideout.");
            }
        }
    }
}
