package observer;

import java.util.ArrayList; //import the requiered arraylist

public abstract class Subject
{
    protected final ArrayList<Observer> observers = new ArrayList<>(); //observer arryalist as stated in uml

    public Subject()
    {

    }

    public void registerObserver(Observer observer) //adds to the arraylist
    {
        observers.add(observer);
    }

    public abstract void issueNotice(int note); //abstract methods no body

    public abstract void notifyObservers(int note);

}