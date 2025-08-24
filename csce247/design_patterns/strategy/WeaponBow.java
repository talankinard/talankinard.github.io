package strategy;

public class WeaponBow implements WeaponBehavior 
{

   public void attack() 
   {
        System.out.print(")");
        /*
         * for loop to determine the length (20) of the attack
         */
        for (int i = 0; i < 20; i++) 
        {
            System.out.print("--> ");
            /*
             * to determine the speed of printing
             */
            Resources.sleep(500);
        }
        System.out.println(); 
    }
}
