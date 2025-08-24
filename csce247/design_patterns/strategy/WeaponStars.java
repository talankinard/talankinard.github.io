package strategy;

public class WeaponStars implements WeaponBehavior
{
    public void attack() 
    {
        for (int i = 0; i < 100; i++) 
        {
            System.out.print("*");
            Resources.sleep(50);
        }
        System.out.println();
    }
}
