package strategy;

public class WeaponNone implements WeaponBehavior
{
    public void attack()
    {
        /*
         * no weapon output :(
         */
        System.out.println("I can't attack...it's just not right.");
    }
}
