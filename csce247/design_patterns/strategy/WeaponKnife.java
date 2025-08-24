package strategy;

public class WeaponKnife implements WeaponBehavior
{
    public void attack() 
    {
        for (int i = 0; i < 20; i++) //30 being thedistance
        {                
            System.out.print("-[--- ");               
            Resources.sleep(100);                     //skeep to delay
        }
        System.out.println();                        
    }
}
