package state;

public class Package 
{
    //uml
    private String name;
    private int quantity;
    private State state;


    //all states that the package could have
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    public Package(String name, int quantity) //construcotr
    {
        this.name = name;
        this.quantity = quantity;

        //states
        this.state =null; //default state of package
        this.orderedState = new OrderedState(this);
        this.inTransitState = new InTransitState(this);
        this.deliveredState = new DeliveredState(this);
    }

    //transitions of package
    public String order()
    {
        setState(orderedState);
        return state.getStatus()+"\n"+state.getETA();
    }

      public String mail()
    {
        setState(inTransitState);
        return state.getStatus()+"\n"+state.getETA();
    }

    public String recieved()
    {
        setState(deliveredState);
        return state.getStatus()+"\n"+state.getETA();
    }

    //getters/setters
    public void setState(State state)
    {
        this.state = state;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    //getverb method
    public String getVerb(String singular, String plural)
    {
        String choice;

        if(quantity==1)
        {
            choice=singular;
        }
        else
        {
            choice=plural;
        }
        return choice;
    }

    public String formatName() //helper class 4 formatting
    {
        if(quantity==1)
        {
            return name;
        }
        else
        {
            return name+"'s";
        }
    }


}
