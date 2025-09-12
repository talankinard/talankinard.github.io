public class DeliveredState extends State
{
    public DeliveredState(Package pkg)
    {
        super(pkg);
    }

    @Override 
    public String getStatus() //same thing
    {
        String subject = "The "+pkg.formatName();
        String beVerb = pkg.getVerb("has", "have");
        return subject+" "+beVerb+" arrived.";
    }

    public String getETA()
    {
        return "";
    }

}
