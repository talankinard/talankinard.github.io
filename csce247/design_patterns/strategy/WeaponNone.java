package strategy;

public class WeaponNone implements WeaponBehavior
{
    public void attack()
    {
        System.out.println("I can't attack...it's just not right.");
    }
}
