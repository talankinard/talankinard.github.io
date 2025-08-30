package observer;

public class Watchman extends Subject //child class
{

   public void issueNotice(int note)
   {
        Trumpet.play(true,note);

        System.out.println("Trumpet fanfair is sounded "+note+" time(s).");

        try { //made me put in try catch
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        clear(); //calls clear terminal method

        notifyObservers(note);

   }

   public void notifyObservers(int note) 
   {
        for (Observer o : observers) 
        {   
            o.update(true, note);    //goes through the list and chooses the subclass and using update method to call the watchman route
        }
    }
    
}
