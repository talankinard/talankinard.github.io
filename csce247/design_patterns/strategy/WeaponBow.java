package strategy;

public class WeaponBow implements WeaponBehavior 
{
    //attack is the sort of base for each weapon which its different in each weapon
   public void attack() 
   {
        System.out.print(")");
        for (int i = 0; i < 20; i++) 
        {
            System.out.print("--> ");
            Resources.sleep(500);
        }
        System.out.println(); //clear
    }
}
