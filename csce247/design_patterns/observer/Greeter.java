package observer;

public class Greeter extends Subject //child class
{

   public void issueNotice(int note)
   {
        Trumpet.play(false,note);

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
        for (Observer o : observers) //o references each sub class of observer stored in arraylist 
        {   
            o.update(false, note);     //false passes the boolean method for greeter
        }
    }
    
}
