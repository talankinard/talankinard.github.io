package strategy;

public abstract class WeaponBehavior 
{
    //attack is a characteristic each weapon shares
    abstract void attack();

    protected int speed;
}
