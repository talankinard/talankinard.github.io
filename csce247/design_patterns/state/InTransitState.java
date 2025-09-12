public class InTransitState extends State
{
    public InTransitState(Package pkg)
    {
        super(pkg);
    }

    @Override //overriding paret
    public String getStatus()
    {
        //same concept as last child class
        String subject="The "+pkg.formatName();
        String beVerb = pkg.getVerb("is","are");
        return subject+" "+beVerb+" out for delivery.";
    }

    @Override
    public String getETA()
    {
        int days = 5; //defauly days in transit
        StringBuilder sb = new StringBuilder();

        //again same thiing butt this time 30 percent chance
        if(random.nextInt(100)<30)
        {
            int extra = random.nextInt(7)+1; //range of days delay could add
            days+=extra;

            //pasted form other chidl class not retyping the super long append lol
            String subject="The "+pkg.formatName();
            String hasVerb = pkg.getVerb("has","have");
            sb.append(subject).append(" ").append(hasVerb).append(" experienced a delay in manufacturing.").append("\n");
        }

        //final msg
        //same concept as before 
        sb.append("The ").append(pkg.formatName()).append(" should arrive within ").append(days).append(" business days.");
        return sb.toString();
    }
}
