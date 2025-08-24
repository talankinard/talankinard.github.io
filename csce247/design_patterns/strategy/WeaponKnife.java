package strategy;

public class WeaponKnife implements WeaponBehavior
/*
 * child classs
 */
{
    public void attack() 
    {
        for (int i = 0; i < 20; i++) 
        {                
            System.out.print("-[--- ");               
            Resources.sleep(100);                     
        }
        System.out.println();                        
    }
}
