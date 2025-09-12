import java.util.Random;

//BASE PARENT CLASS

public abstract class State 
{
    
    protected Package pkg;
    protected Random random;

    public State(Package pkg)
    {
        this.pkg = pkg;
        this.random = new Random();
    }

    public abstract String getStatus(); //status of package
    public abstract String getETA();
}
