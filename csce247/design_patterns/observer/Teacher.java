package observer;

public class Teacher implements Observer //child of
{
    Teacher(Subject watchman, Subject Greeter)
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
                System.out.println("Teacher: Engages children in an activity so they do not get distracted");
            }
            else if(note==2)
            {
                System.out.println("Gathers children to watch the formal entrance.");
            }
        }
        else //watchman route
        {
            if(note ==1)
            {
                System.out.println("Teacher: Helps get every child home safe.");
            }
            else if(note ==2)
            {
                System.out.println("Teacher: Brings all students to the underground shelter.");
            }
        }
    }
}

