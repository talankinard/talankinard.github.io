package strategy;

public abstract class Character  
{
    private final String name = "";
    private WeaponBehavior weaponBehavior;

    protected Character(String name)
    {
        this.name = name;
        this.weaponBehavior = new WeaponNone(); //weapon none default nulll in this case
    }

    public abstract String getRole();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior)
    {
        this.weaponBehavior = weaponBehavior;
    }

    public WeaponBehavior getWeaponBehavior()
    {
        return weaponBehavior;
    }

    public String getName()
    {
        return name;
    }

    public void attack()
    {
        System.out.println((getRole()+" "+name+" "));
        weaponBehavior.attack();
    }

    public String toString()
    {
        return getRole()+" "+name;
    }
}